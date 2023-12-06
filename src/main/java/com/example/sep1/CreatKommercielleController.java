package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreatKommercielleController {

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

    @FXML TextField antalEtager;

    @FXML
    TextField type;




    private Kommerciellelist kommerciellelist;
    private  OversigtController oversigtController ;

    public void init(Kommerciellelist kommerciellelist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.kommerciellelist=kommerciellelist;
        //    ProjekType.setText(projektlist.getKommercielledefault().getType());

        if(kommerciellelist.getSelectedKommercielle()!=null)
        {
            Kommercielle selectedKommercielle = kommerciellelist.getSelectedKommercielle();
            Name.setText(selectedKommercielle.getNavn());
            Price.setText("" + selectedKommercielle.getBudget());
            Exeptedtime.setText("" + selectedKommercielle.getForventetTid());
            Size.setText("" + selectedKommercielle.getStørrelse());
            Hourspent.setText("" + selectedKommercielle.getMandeTimer());
            antalEtager.setText(""+selectedKommercielle.getAntalEtager());
            type.setText(selectedKommercielle.getType());
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
        if(kommerciellelist.getSelectedKommercielle()!=null)
        {
            int size = Integer.parseInt(Size.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());

            String name = Name.getText();
            int pris = Integer.parseInt(Price.getText());
            int antaletager = Integer.parseInt(antalEtager.getText());
            String typen = type.getText();

            Kommercielle kommercielle = new Kommercielle(name, pris, exepteced,
                size, hours, antaletager, typen);
            kommerciellelist.UpdateKommercielle(kommercielle,kommerciellelist.getSelectedKommercielle());
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            kommerciellelist.setSelectedKommercielle(null);

        }
        else {
            int size = Integer.parseInt(Size.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());

            String name = Name.getText();
            int pris = Integer.parseInt(Price.getText());
            int antaletager = Integer.parseInt(antalEtager.getText());
            String typen = type.getText();

            Kommercielle kommercielle = new Kommercielle(name, pris, exepteced,
                size, hours, antaletager, typen);
            kommerciellelist.add(kommercielle);
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();

        }
    }
}
