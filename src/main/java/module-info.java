module io.github.davidcascante.unostack {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.davidcascante.unostack to javafx.fxml;
    exports io.github.davidcascante.unostack;
}