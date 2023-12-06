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

        if(industrillelist.getSelectedIndustrielle() != null)
        {
            Industrielle selectedIndustrielle = industrillelist.getSelectedIndustrielle();
            Name.setText(selectedIndustrielle.getNavn());
            Price.setText("" + selectedIndustrielle.getBudget());
            Exeptedtime.setText("" + selectedIndustrielle.getForventetTid());
            Size.setText("" + selectedIndustrielle.getStørrelse());
            Hourspent.setText("" + selectedIndustrielle.getMandeTimer());
            type.setText(selectedIndustrielle.getType());
        }

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
        if(industrillelist.getSelectedIndustrielle() != null)
        {
            String name = Name.getText();
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int pris = Integer.parseInt(Price.getText());
            int size = Integer.parseInt(Size.getText());
            int hours = Integer.parseInt(Hourspent.getText());
            String industriltype = type.getText();

            Industrielle industrielle = new Industrielle(name,pris,exepteced,
                size, hours,industriltype);
            industrillelist.UpdateIndustrielle(industrielle,industrillelist.getSelectedIndustrielle());
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            industrillelist.setSelectedIndustrielle(null);
        }

        else
        {
            String name = Name.getText();
            int size = Integer.parseInt(Size.getText());
            int pris = Integer.parseInt(Price.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());
            String industriltype = type.getText();



            Industrielle industrielle = new Industrielle(name, pris,exepteced,size, hours,industriltype);
            industrillelist.add(industrielle);
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            industrillelist.setSelectedIndustrielle(null);
        }

    }
}
