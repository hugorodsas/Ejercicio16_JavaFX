package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TextField nombre = new TextField();
        nombre.setPromptText("Introduce tu nombre:");

        TextField correo = new TextField();
        correo.setPromptText("Introduce tu correo:");

        Label mensaje = new Label();

        Button enviar = new Button("Enviar");

        enviar.setOnAction(e -> {
            if(nombre.getText().isEmpty() || correo.getText().isEmpty()){
                mensaje.setText("Todos los campos dene de estar rellenados");
            }else {
                mensaje.setText("Enviado correctamente");
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.getChildren().addAll(new Label("Nombre:"),nombre,new Label("Correo:"),correo,mensaje,enviar);

        Scene scene = new Scene(root, 350, 180);
        stage.setTitle("Formulario JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

