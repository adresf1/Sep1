package com.example.sep1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Oversigt {

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("oversigt.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        HelloController helloController = fxmlLoader.getController();
        LoginModel login = new LoginModel();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
