package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreatIndustrilleController {

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


    @FXML
    TextField type;




    private Industrillelist industrillelist;
    private  OversigtController oversigtController ;

    public void init(Industrillelist industrillelist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.industrillelist=industrillelist;
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
        String industriltype = type.getText();



        Industrielle industrielle = new Industrielle(name, exepteced,pris,size, hours,industriltype);
        industrillelist.add(industrielle);
        oversigtController.refresh();

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();


    }
}
