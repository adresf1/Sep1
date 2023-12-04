package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreatVejbygningcontroller {

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

    @FXML TextField Længde;

    @FXML
    TextField Bredde;
    @FXML TextField Bro;

    @FXML
    TextField Tunnel;



    private Vejbygninglist vejbygninglist;
    private  OversigtController oversigtController ;

    public void init(Vejbygninglist vejbygninglist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.vejbygninglist=vejbygninglist;
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
        int lændge = Integer.parseInt(Længde.getText());
        int bredde = Integer.parseInt(Bredde.getText());
        int bro = Integer.parseInt(Bro.getText());
         int tunnel = Integer.parseInt(Tunnel.getText());



        VejBygning vejBygning = new VejBygning(name, exepteced,pris,size, hours,lændge,bredde,bro,tunnel);
        vejbygninglist.add(vejBygning);
        oversigtController.refresh();

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();


    }
}
