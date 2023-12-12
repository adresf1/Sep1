package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class creatBoligByggeriController {


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
    @FXML ChoiceBox<String> Choicebox;



    private Boligbyggerilist boligbyggerilist;
    private  OversigtController oversigtController ;
    private void defaultBolig()
    {
        Kitchens.setText("1");
        Bathrooms.setText("1");
        Status.setText("NEW");
        OtherRooms.setText("1");
        Choicebox.setValue("False");
    }

    public void init(Boligbyggerilist boligbyggerilist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
       this.boligbyggerilist=boligbyggerilist;
        //    ProjekType.setText(projektlist.getKommercielledefault().getType());
        //defaultBolig();
        Choicebox.getItems().addAll("True","False");

        if(boligbyggerilist.getSelectedBolig() != null)
        {
            BoligByggeri selectedbolig = boligbyggerilist.getSelectedBolig();
            Name.setText(selectedbolig.getNavn());
            Price.setText("" + selectedbolig.getBudget());
            Exeptedtime.setText("" + selectedbolig.getForventetTid());
            Size.setText("" + selectedbolig.getStørrelse());
            Hourspent.setText("" + selectedbolig.getMandeTimer());
            Kitchens.setText("" + selectedbolig.getAntalKekkener());
            Bathrooms.setText("" + selectedbolig.getAntalBadeværelser());
            OtherRooms.setText("" + selectedbolig.getAndreVærelser());
            Status.setText(selectedbolig.getStatus());
            Choicebox.getValue();
        }
        defaultBolig();



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
        if(boligbyggerilist.getSelectedBolig() != null)
        {
            int size = Integer.parseInt(Size.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());
            int antalKøkkener = Integer.parseInt(Kitchens.getText());
            int antalBadeværelser = Integer.parseInt(Bathrooms.getText());
            String name = Name.getText();
            int pris = Integer.parseInt(Price.getText());
            int andreVærelser = Integer.parseInt(OtherRooms.getText());
            String Statu = Status.getText();
            String Completed = Choicebox.getValue();

            BoligByggeri boligByggeri = new BoligByggeri(name, pris, exepteced,
                    size, Completed,hours, antalKøkkener, antalBadeværelser, andreVærelser,
                    Statu);
            boligbyggerilist.UpdateBolig(boligByggeri,boligbyggerilist.getSelectedBolig());
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            boligbyggerilist.setSelectedBolig(null);

        }
        else
        {
            int size = Integer.parseInt(Size.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());
            int antalKøkkener = Integer.parseInt(Kitchens.getText());
            int antalBadeværelser = Integer.parseInt(Bathrooms.getText());
            String name = Name.getText();
            int pris = Integer.parseInt(Price.getText());
            int andreVærelser = Integer.parseInt(OtherRooms.getText());
            String Statu = Status.getText();
            String Completed = Choicebox.getValue();


            BoligByggeri boligByggeri = new BoligByggeri(name, pris, exepteced,
                    size,Completed ,hours, antalKøkkener, antalBadeværelser, andreVærelser,
                    Statu);
            boligbyggerilist.add(boligByggeri);
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            boligbyggerilist.setSelectedBolig(null);

        }

    }


}









