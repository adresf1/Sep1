package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class creatProjektController {


    @FXML
    TextField Name;
    @FXML
    TextField Price;
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



    private Boligbyggerilist boligbyggerilist;
    private  OversigtController oversigtController ;

    public void init(Boligbyggerilist boligbyggerilist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
       this.boligbyggerilist=boligbyggerilist;
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
        int antalKøkkener = Integer.parseInt(Kitchens.getText());
        int antalBadeværelser = Integer.parseInt(Bathrooms.getText());
        String name = Name.getText();
        int pris = Integer.parseInt(Price.getText());
        int andreVærelser = Integer.parseInt(OtherRooms.getText());
        String Statu = Status.getText();


        BoligByggeri boligByggeri= new BoligByggeri(name,pris, exepteced,size,hours,antalKøkkener,antalBadeværelser,andreVærelser,Statu);
        boligbyggerilist.add(boligByggeri);
        oversigtController.refresh();

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();


    }




}









