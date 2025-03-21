package com.example.sep1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
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
    @FXML
    ChoiceBox<String> Choicebox;



    private Vejbygninglist vejbygninglist;
    private  OversigtController oversigtController ;
private void defaultVejbyggeri()
{
    Exeptedtime.setText("18");
    Bro.setText("0");
    Tunnel.setText("0");
    Choicebox.setValue("False");
}
    public void init(Vejbygninglist vejbygninglist, OversigtController oversigtController) {
        this.oversigtController=oversigtController;
        this.vejbygninglist=vejbygninglist;
        //    ProjekType.setText(projektlist.getKommercielledefault().getType());
        Choicebox.getItems().addAll("True","False");

        if(vejbygninglist.getSelectedVejbygning()!=null)
        {
            VejBygning selectedVejbygning = vejbygninglist.getSelectedVejbygning();
            Name.setText(selectedVejbygning.getNavn());
            Price.setText("" + selectedVejbygning.getBudget());
            Exeptedtime.setText("" + selectedVejbygning.getForventetTid());
            Size.setText("" + selectedVejbygning.getStørrelse());
            Hourspent.setText("" + selectedVejbygning.getMandeTimer());
            Længde.setText(""+selectedVejbygning.getLængde());
            Bredde.setText(""+selectedVejbygning.getBredde());
            Bro.setText(""+selectedVejbygning.getBro());
            Tunnel.setText(""+selectedVejbygning.getTunnel());
        }
        defaultVejbyggeri();
    }


    public void cancelpressed(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

    }

    public void opret(ActionEvent event) {
        if(vejbygninglist.getSelectedVejbygning()!=null)
        {
            int size = Integer.parseInt(Size.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());

            String name = Name.getText();
            int pris = Integer.parseInt(Price.getText());
            int lændge = Integer.parseInt(Længde.getText());
            int bredde = Integer.parseInt(Bredde.getText());
            int bro = Integer.parseInt(Bro.getText());
            int tunnel = Integer.parseInt(Tunnel.getText());
            String Completed = Choicebox.getValue();

            VejBygning vejBygning = new VejBygning(name, pris, exepteced, size,
                hours,Completed,lændge, bredde, bro, tunnel);
            vejbygninglist.UpdateVejbygning(vejBygning,vejbygninglist.getSelectedVejbygning());
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            vejbygninglist.setSelectedVejbygning(null);

        }
        else{
            int size = Integer.parseInt(Size.getText());
            int exepteced = Integer.parseInt(Exeptedtime.getText());
            int hours = Integer.parseInt(Hourspent.getText());

            String name = Name.getText();
            int pris = Integer.parseInt(Price.getText());
            int lændge = Integer.parseInt(Længde.getText());
            int bredde = Integer.parseInt(Bredde.getText());
            int bro = Integer.parseInt(Bro.getText());
            int tunnel = Integer.parseInt(Tunnel.getText());
            String Completed = Choicebox.getValue();



            VejBygning vejBygning = new VejBygning(name, pris,exepteced,size, hours,Completed,lændge,bredde,bro,tunnel);
            vejbygninglist.add(vejBygning);
            oversigtController.refresh();

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            vejbygninglist.setSelectedVejbygning(null);
        }
    }
}
