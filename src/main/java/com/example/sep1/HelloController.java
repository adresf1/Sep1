package com.example.sep1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static javafx.scene.paint.Color.rgb;

public class HelloController {
    @FXML private Button login;
    @FXML  private TextField username;

    @FXML private Label password;

    @FXML private Label resp;
    @FXML private Button cancel;

    private LoginModel login1 = new LoginModel();

    public void OnButtonpressed()
    {
        String input = username.getText();
        String pass = password.getText();
        if (login1.login(input, pass))
        {
            resp.setText("You have logged in seccesfully");
            resp.setTextFill(rgb(0, 255, 0));
        }
        else
        {
            resp.setText("Wrong, try again");
            resp.setTextFill(rgb(255, 0, 0));
        }
    }
    public void cancelaction()
    {
        username.setText(null);
        password.setText(null);
        resp.setText("Try again");
    }


}