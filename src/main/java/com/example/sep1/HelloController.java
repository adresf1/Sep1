package com.example.sep1;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.paint.Color.rgb;

public class HelloController
{
    @FXML private Button button;
    @FXML private TextField username;
    @FXML private PasswordField Password;
    @FXML private Button cancel;
    @FXML private Label resp;


    private LoginModel model1 = new LoginModel();
    private Paint rgb;

    public void OnButtonPressed() throws IOException {
        String input = username.getText();
        String pass = Password.getText();
        if (model1.login(input, pass)) {
            resp.setText("You have logged in sucessfully");
            resp.setTextFill(rgb(0, 255, 0));

            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Oversigt.fxml"));
            Parent root = fxmlLoader.load();
            Stage oversigt = new Stage();

            oversigt.setTitle("Oversigt");
            oversigt.setScene(new Scene(root, 1000, 800));

            oversigt.show();
        } else {
            resp.setText("Wrong, try again");
            resp.setTextFill(rgb(255, 0, 0));
        }
    }

    public void cancelaction()
    {
        username.setText(null);
        Password.setText(null);
        resp.setText("Try again");

    }
}
