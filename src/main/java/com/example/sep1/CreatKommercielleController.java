package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
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

    @FXML ChoiceBox<String> Choicebox;




    private Kommerciellelist kommerciellelist;
    private  OversigtController oversigtController ;
    private void defaultkommerciel()
    {
        Exeptedtime.setText("18");
        antalEtager.setText("1");
        Choicebox.setValue("False");

    }
    public void init(Kommerciellelist kommerciellelist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.kommerciellelist=kommerciellelist;
        //    ProjekType.setText(projektlist.getKommercielledefault().getType());
        Choicebox.getItems().addAll("True","False");

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
        defaultkommerciel();

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
            String Completed = Choicebox.getValue();

            Kommercielle kommercielle = new Kommercielle(name, pris, exepteced,
                size, hours,Completed, antaletager, typen);
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
            String Completed = Choicebox.getValue();

            Kommercielle kommercielle = new Kommercielle(name, pris, exepteced,
                size, hours,Completed,antaletager, typen);
            kommerciellelist.add(kommercielle);
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            kommerciellelist.setSelectedKommercielle(null);

        }
    }
}
