package io.github.davidcascante.unostack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import io.github.davidcascante.unostack.controllers.ModulesController;

public class AppInitializer {
    public static void initialize() throws IOException {
        String BASEPATH = "C:/UnoStack/";

        String[] paths = {
                BASEPATH + "io/github/davidcascante/unostack/modules",
                BASEPATH + "logs",
                BASEPATH + "data",
        };

        for (String path : paths) {
            Path newPath = Paths.get(path);
            Files.createDirectories(newPath);
        }

        ModulesController.JSOReader();
    }
}