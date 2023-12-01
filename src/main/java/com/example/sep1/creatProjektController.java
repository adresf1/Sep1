package com.example.sep1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.PrimitiveIterator;

public class creatProjektController {


    @FXML
    TextField Name;
    @FXML
    TextField Price;
    @FXML
    TextField ProjekType;
    @FXML
    TextField Size;
    @FXML
    TextField Exeptedtime;

    @FXML
    TextField Hourspent;


    @FXML TextField Kitchens;
    @FXML TextField Bathrooms;
    @FXML TextField OtherRooms;
    @FXML TextField Status;



    private Projektlist projektlist;
    private  OversigtController oversigtController ;

    public void init(Projektlist projektlist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.projektlist = projektlist;
    //    ProjekType.setText(projektlist.getKommercielledefault().getType());


    }


    public void cancelpressed(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

    }
    private void setDefault()
    {
    }

    public void opret(ActionEvent event) {
        int size = Integer.parseInt(Size.getText());
        int exepteced = Integer.parseInt(Exeptedtime.getText());
        int hours = Integer.parseInt(Hourspent.getText());

        String name = Name.getText();
        int pris = Integer.parseInt(Price.getText());
        String Statu = Status.getText();


        Projekt projekt= new Projekt(name,pris,Statu,exepteced,size,hours,0);
        projektlist.add(projekt);
        oversigtController.refresh();

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();


    }




}









