package io.github.davidcascante.unostack.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import io.github.davidcascante.unostack.models.Configuration;
import io.github.davidcascante.unostack.models.Module;

public class ModulesController {

    private static final String MODULES_JSON = "io/github/davidcascante/unostack/modules/modules.json";

    public static void JSOReader() {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // En apps modulares (JPMS), getClassLoader() no ve recursos del módulo.
            // Usar getModule() o Class.getResourceAsStream(), igual que App carga Main.fxml.
            InputStream inputStream = ModulesController.class.getModule()
                    .getResourceAsStream(MODULES_JSON);

            if (inputStream == null) {
                System.out.println("❌ No encontré el archivo en el módulo: " + MODULES_JSON);
                System.out.println("📁 Verifica que exista en src/main/resources/" + MODULES_JSON);
                System.out.println("📁 y que el proyecto esté compilado (target/classes/" + MODULES_JSON + ")");
                return;
            }

            System.out.println("✅ Archivo encontrado correctamente");

            Configuration config = mapper.readValue(inputStream, Configuration.class);

            for (Module module : config.getModules()) {
                System.out.println("📦 " + module.getName());
                System.out.println("   Tipo: " + module.getType());
                System.out.println("   Versiones: " + module.getVersions().size());

                if (module.getOther_ports() != null) {
                    System.out.println("   Puertos extra: " + module.getOther_ports());
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("❌ Error al leer el archivo JSON:");
            e.printStackTrace();
        }
    }
}