package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;

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

    public void creatProjekt() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("creatProjekt.fxml"));

        Parent root = fxmlLoader.load();

        Stage oversigt = new Stage();
        creatProjektController controller = fxmlLoader.getController();
        controller.init(projektlist, this);

        oversigt.setScene(new Scene(root, 1000, 800));
        oversigt.setTitle("OprettelseAfProjekt");
        oversigt.show();

    }
    public void OnButtonpreseedChange() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("ChangeDefault.fxml"));
        Parent root = fxmlLoader.load();
        ChangeDefaultController changeDefaultController = fxmlLoader.getController();
        changeDefaultController.setProjektlist(projektlist);
        Stage oversigt = new Stage();
        oversigt.setScene(new Scene(root, 600, 400));
        oversigt.setTitle("Oversigt");
        oversigt.show();

    }

    public void init(Projektlist projektlist)

    {
        this.projektlist=projektlist;

        projektType.setCellValueFactory(new PropertyValueFactory<>("projektType"));

        price.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        name.setCellValueFactory(new PropertyValueFactory<>("navn"));

        projektTableView.getItems().addAll(projektlist.getData());

    }

    public void refresh() {
        projektTableView.getItems().clear();
        projektTableView.getItems().addAll(projektlist.getData());


    }

    public void OnbuttonEditpreesed(){

    }

    public void OnbuttonDeletepreesed(){
        Projekt selectedprojekt = projektTableView.getSelectionModel().getSelectedItem();
        projektlist.remove(selectedprojekt);
        refresh();
    }


    public void OnbuttonSavepressed( ) throws IOException {
      projektlist.saveData();

    }
}
