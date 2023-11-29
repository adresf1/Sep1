package com.example.sep1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.PrimitiveIterator;

public class creatProjektController {


    @FXML
    TextField Name;
    @FXML
    TextField Price;
    @FXML
    TextField ProjekType;
    private VejBygning vejBygning;
    private Kommercielle kommercielle;
    private Industrielle industrielle;
    private BoligByggeri boligByggeri;

    private Projektlist projektlist;
    private  OversigtController oversigtController ;

    public void init(Projektlist projektlist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.projektlist = projektlist;
    }


    public void cancelpressed() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Oversigt.fxml"));
        Parent root = fxmlLoader.load();
        Stage oversigt = new Stage();
        oversigt.setTitle("Oversigt");
        oversigt.setScene(new Scene(root, 1000, 800));

        oversigt.show();
    }

    public void opret() {

        String name = Name.getText();
        int pris = Integer.parseInt(Price.getText());
        String projekType = ProjekType.getText();


        Projekt projekt= new Projekt(name,pris,projekType,0,0,0,0);
        projektlist.add(projekt);
        oversigtController.refresh();


    }




}









