package com.example.sep1;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

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

    public void OnButtonPressed()
    {
        String input = username.getText();
        String pass = Password.getText();
        if (model1.login(input, pass))
        {
            resp.setText("You have logged in seccesfully");
            resp.setTextFill(rgb(0, 255, 0));
            Oversigt frontPage = new Oversigt();
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
        Password.setText(null);
        resp.setText("Try again");
    }
}
