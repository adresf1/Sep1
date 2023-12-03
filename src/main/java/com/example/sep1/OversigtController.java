package com.example.sep1;

import javafx.css.Size;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;

public class OversigtController {

    @FXML
    TableView <BoligByggeri> BoligTableView;

    @FXML TableColumn <BoligByggeri, String> name;
    @FXML TableColumn <BoligByggeri, Integer> price;
    @FXML TableColumn <BoligByggeri, Integer> Exeptedtime;
    @FXML TableColumn <BoligByggeri, Integer> Size;
    @FXML TableColumn <BoligByggeri, Integer> Hourspent;
    @FXML TableColumn <BoligByggeri, Integer> Kitchens;
    @FXML TableColumn <BoligByggeri, Integer> Bathrooms;
    @FXML TableColumn <BoligByggeri, Integer> OtherRooms;



    @FXML
    TableView <VejBygning> VejbygningTableView;
    @FXML TableColumn <VejBygning, String> Vejbygningname;
    @FXML TableColumn <VejBygning, Integer> Vejbygningsprice;
    @FXML TableColumn <VejBygning, Integer> VejbygningExeptedtime;
    @FXML TableColumn <VejBygning, Integer> VejbygningSize;
    @FXML TableColumn <VejBygning, Integer> VejbygningHourspent;
    @FXML TableColumn <VejBygning, Integer> Længde;
    @FXML TableColumn <VejBygning, Integer> Bredde;
    @FXML TableColumn <VejBygning, Integer> Bro;
    @FXML TableColumn <VejBygning, Integer> Tunnel;

    @FXML
    TableView <Kommercielle> kommercielleTableView;
    @FXML TableColumn <VejBygning, String> Kommerciellename;
    @FXML TableColumn <VejBygning, Integer>Kommercielleprice;
    @FXML TableColumn <VejBygning, Integer> KommerciellegExeptedtime;
    @FXML TableColumn <VejBygning, Integer>KommercielleSize;
    @FXML TableColumn <VejBygning, Integer> KommercielleHourspent;
    @FXML TableColumn <VejBygning, Integer> antalEtager;
    @FXML TableColumn <VejBygning, String> kommercielletype;

    @FXML
    TableView <Industrielle> IndustrilleTableView;
    @FXML TableColumn <Industrielle, String> Industrielleename;
    @FXML TableColumn <Industrielle, Integer>Industrielleprice;
    @FXML TableColumn <Industrielle, Integer> IndustrielleExeptedtime;
    @FXML TableColumn <Industrielle, Integer>IndustrielleSize;
    @FXML TableColumn <Industrielle, Integer> IndustrielleHourspent;

    @FXML TableColumn <Industrielle, String> Industrielletype;




private Industrillelist industrillelist;
    private Kommerciellelist kommerciellelist;
    private Boligbyggerilist boligbyggerilist;
    private Vejbygninglist vejbygninglist;


    public void creatBoligbyggeriProjekt() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("creatProjekt.fxml"));

        Parent root = fxmlLoader.load();

        Stage oversigt = new Stage();
        creatProjektController controller = fxmlLoader.getController();
        controller.init(boligbyggerilist, this);

        oversigt.setScene(new Scene(root, 1000, 800));
        oversigt.setTitle("OprettelseAfProjekt");
        oversigt.show();

    }
    public void OnButtonpreseedChange() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("ChangeDefault.fxml"));
        Parent root = fxmlLoader.load();
        ChangeDefaultController changeDefaultController = fxmlLoader.getController();
      //  changeDefaultController.setProjektlist(projektlist);
        Stage oversigt = new Stage();
        oversigt.setScene(new Scene(root, 600, 400));
        oversigt.setTitle("Oversigt");
        oversigt.show();

    }

    public void init(Boligbyggerilist boligbyggerilist)

    {
        this.boligbyggerilist=boligbyggerilist;
        Size.setCellValueFactory(new PropertyValueFactory<>("størrelse"));
        Hourspent.setCellValueFactory(new PropertyValueFactory<>("mandeTimer"));
        Kitchens.setCellValueFactory(new PropertyValueFactory<>("antalKekkener"));
        Bathrooms.setCellValueFactory(new PropertyValueFactory<>("antalBadeværelser"));
        OtherRooms.setCellValueFactory(new PropertyValueFactory<>("andreVærelser"));
        Exeptedtime.setCellValueFactory(new PropertyValueFactory<>("forventetTid"));
        price.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        name.setCellValueFactory(new PropertyValueFactory<>("navn"));
        Tunnel.setCellValueFactory(new PropertyValueFactory<>("tunnel"));

        BoligTableView.getItems().addAll(boligbyggerilist.getData());

    }

    public void refresh() {
        BoligTableView.getItems().clear();
        BoligTableView.getItems().addAll(boligbyggerilist.getData());
        VejbygningTableView.getItems().addAll(vejbygninglist.getData());
        kommercielleTableView.getItems().addAll(kommerciellelist.getData());
        IndustrilleTableView.getItems().addAll(industrillelist.getData());


    }

    public void OnbuttonEditpreesed(){

    }

    public void OnbuttonDeletepreesed(){
            BoligByggeri selectedBolig = (BoligByggeri) BoligTableView.getSelectionModel().getSelectedItem();
        VejBygning selectedVej = VejbygningTableView.getSelectionModel().getSelectedItem();
        Industrielle selectedIndustri = IndustrilleTableView.getSelectionModel().getSelectedItem();
        Kommercielle selectedKommerciell = kommercielleTableView.getSelectionModel().getSelectedItem();
            if (selectedBolig != null) {
                boligbyggerilist.remove(selectedBolig);
            }

            if (selectedVej != null) {
                vejbygninglist.remove(selectedVej);
            }

            if (selectedIndustri != null) {
                industrillelist.remove(selectedIndustri);
            }

            if (selectedKommerciell != null) {
                kommerciellelist.remove(selectedKommerciell);
            }

            refresh();


    }



    public void OnbuttonSavepressed( ) throws IOException {
      boligbyggerilist.saveData();

    }


    public void init(Vejbygninglist vejbygninglist)

    {
        this.vejbygninglist=vejbygninglist;
        VejbygningSize.setCellValueFactory(new PropertyValueFactory<>("størrelse"));
        VejbygningHourspent.setCellValueFactory(new PropertyValueFactory<>("mandeTimer"));
        Længde.setCellValueFactory(new PropertyValueFactory<>("længde"));
        Bredde.setCellValueFactory(new PropertyValueFactory<>("bredde"));
        Bro.setCellValueFactory(new PropertyValueFactory<>("bro"));
        Tunnel.setCellValueFactory(new PropertyValueFactory<>("tunnel"));
        VejbygningExeptedtime.setCellValueFactory(new PropertyValueFactory<>("forventetTid"));
        Vejbygningsprice.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        Vejbygningname.setCellValueFactory(new PropertyValueFactory<>("navn"));

        VejbygningTableView.getItems().addAll(vejbygninglist.getData());

    }

    public void creatVejbygningProjekt() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("OpretVejbygning.fxml"));

        Parent root = fxmlLoader.load();

        Stage oversigt = new Stage();
        CreatVejbygningcontroller controller = fxmlLoader.getController();
        controller.init(vejbygninglist, this);

        oversigt.setScene(new Scene(root, 1000, 800));
        oversigt.setTitle("OprettelseAfProjekt");
        oversigt.show();

    }

    public void creatKommerciellepressed() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("OpretKommercielle.fxml"));

        Parent root = fxmlLoader.load();

        Stage oversigt = new Stage();
        CreatKommercielleController controller = fxmlLoader.getController();
        controller.init(kommerciellelist, this);

        oversigt.setScene(new Scene(root, 1000, 800));
        oversigt.setTitle("OprettelseAfProjekt");
        oversigt.show();

    }


    public void init(Kommerciellelist kommerciellelist)

    {
        this.kommerciellelist=kommerciellelist;
        KommercielleHourspent.setCellValueFactory(new PropertyValueFactory<>("mandeTimer"));
        antalEtager.setCellValueFactory(new PropertyValueFactory<>("antalEtager"));
        kommercielletype.setCellValueFactory(new PropertyValueFactory<>("type"));
        KommerciellegExeptedtime.setCellValueFactory(new PropertyValueFactory<>("forventetTid"));
        Kommercielleprice.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        Kommerciellename.setCellValueFactory(new PropertyValueFactory<>("navn"));
        KommercielleSize.setCellValueFactory(new PropertyValueFactory<>("størrelse"));
        kommercielleTableView.getItems().addAll(kommerciellelist.getData());

    }

    public void creatindustrilleepressed() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(OversigtController.class.getResource("OpretIndustrielle.fxml"));

        Parent root = fxmlLoader.load();

        Stage oversigt = new Stage();
        CreatIndustrilleController controller = fxmlLoader.getController();
        controller.init(industrillelist, this);

        oversigt.setScene(new Scene(root, 1000, 800));
        oversigt.setTitle("OprettelseAfProjekt");
        oversigt.show();

    }

    public void init(Industrillelist industrillelist)

    {
        this.industrillelist=industrillelist;
        IndustrielleHourspent.setCellValueFactory(new PropertyValueFactory<>("mandeTimer"));
        Industrielletype.setCellValueFactory(new PropertyValueFactory<>("type"));
        IndustrielleExeptedtime.setCellValueFactory(new PropertyValueFactory<>("forventetTid"));
        Industrielleprice.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        Industrielleename.setCellValueFactory(new PropertyValueFactory<>("navn"));
        IndustrielleSize.setCellValueFactory(new PropertyValueFactory<>("størrelse"));
        IndustrilleTableView.getItems().addAll(industrillelist.getData());

    }



}
