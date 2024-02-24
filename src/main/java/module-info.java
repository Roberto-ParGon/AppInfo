module com.ejercicios.minecraftproyect {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ejercicios.minecraftproyect to javafx.fxml;
    exports com.ejercicios.minecraftproyect;
}