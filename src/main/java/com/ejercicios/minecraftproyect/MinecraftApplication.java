package com.ejercicios.minecraftproyect;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.io.IOException;

public class MinecraftApplication extends Application {
    @Override
    public void start(Stage stage) {

        VBox root = new VBox();

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Aplicación de Minecraft:3");

        Label texto = new Label("Hola:3");

        root.getChildren().addAll(texto);

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}