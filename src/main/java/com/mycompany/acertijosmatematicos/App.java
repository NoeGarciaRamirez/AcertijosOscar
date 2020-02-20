package com.mycompany.acertijosmatematicos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root= new StackPane();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Cuadrante cuadrante = new Cuadrante();
        Tablero tablero = new Tablero();
        root.getChildren().add(tablero);
        tablero.getChildren().add(cuadrante);
    }

    public static void main(String[] args) {
        launch();
    }

}