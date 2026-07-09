module io.github.davidcascante.unostack {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;


    opens io.github.davidcascante.unostack to javafx.fxml;
    exports io.github.davidcascante.unostack;
    exports io.github.davidcascante.unostack.models;
    opens io.github.davidcascante.unostack.models to javafx.fxml;
}