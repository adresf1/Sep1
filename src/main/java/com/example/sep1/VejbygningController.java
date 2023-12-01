package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;

public class VejbygningController {








  public void cancelpressed(ActionEvent event) throws IOException
  {
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    stage.close();

  }
}
