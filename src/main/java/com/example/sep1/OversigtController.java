package com.example.sep1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class OversigtController {

    @FXML
    TableView <Projekt> projektTableView;
@FXML TableColumn <Projekt, String> name;

@FXML TableColumn <Projekt, Integer> price;
    @FXML TableColumn <Projekt, String> projektType;
    @FXML TableColumn <Projekt, String> expectedTime;
    @FXML TableColumn <Projekt, Boolean> delete;

    @FXML TableColumn <Projekt, Boolean> complete;

@FXML  Button creatprojekt;

private Projektlist projektlist;

    public void creatProjekt(){




    }
    public void OnButtonpreseedChange() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("ChangeDefault.fxml"));
        Parent root = fxmlLoader.load();
        Stage oversigt = new Stage();
        oversigt.setScene(new Scene(root, 1000, 800));
        oversigt.setTitle("Oversigt");
        oversigt.show();
    }

    public void init(Projektlist projektlist)

    {
        this.projektlist=projektlist;
        //Create a binding between Student object and it's attributes
        //Uses reflection, so String parameter must match name of Getter
        name.setCellValueFactory(new PropertyValueFactory<>("projektType"));
        projektTableView.getItems().addAll(projektlist.getData());

    }

}
