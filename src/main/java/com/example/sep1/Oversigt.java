package com.example.sep1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Oversigt extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Oversigt.class.getResource("Oversigt.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        HelloController helloController = fxmlLoader.getController();
        LoginModel login = new LoginModel();
        stage.setTitle("Oversigt!");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}