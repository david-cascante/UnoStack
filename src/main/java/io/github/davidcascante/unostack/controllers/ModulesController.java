package io.github.davidcascante.unostack.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import io.github.davidcascante.unostack.models.Configuration;
import io.github.davidcascante.unostack.models.Module;

public class ModulesController {

    public static void JSOReader() {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // ✅ CORRECCIÓN 1: Usar el nombre correcto de la clase
            InputStream inputStream = ModulesController.class.getClassLoader()
                    .getResourceAsStream("/io/github/davidcascante/unostack/modules/modules.json");

            // ✅ CORRECCIÓN 2: Verificar si existe el archivo
            if (inputStream == null) {
                System.out.println("❌ No encontré el archivo en: src/main/resources/modules/modules.json");
                System.out.println("📁 Verifica que el archivo exista en esa ruta");
                return;
            }

            System.out.println("✅ Archivo encontrado correctamente");

            // ✅ CORRECCIÓN 3: Leer el JSON
            Configuration config = mapper.readValue(inputStream, Configuration.class);

            // ✅ CORRECCIÓN 4: Mostrar los datos
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