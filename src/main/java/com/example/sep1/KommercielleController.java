package com.example.sep1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class KommercielleController
{
  @FXML private TextField Budget;
  @FXML private TextField forventet_tid;
  @FXML private TextField størrelse;
  @FXML private TextField type;

 private Kommercielle kommercielle;
  public void SubmitChanges()
  {
    int budget = Integer.parseInt(Budget.getText());
    int Forventet_tid = Integer.parseInt(forventet_tid.getText());
    int Størrelse = Integer.parseInt(størrelse.getText());
    String Type = type.getText();

    //kommercielle = new Kommercielle(Forventet_tid,budget,Størrelse,Type);

  }
}
