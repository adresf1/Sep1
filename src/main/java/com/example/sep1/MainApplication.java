package com.example.sep1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Oversigt.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);
        OversigtController controller = fxmlLoader.getController();


        FileInputStream fileInputStream = new FileInputStream("data.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        FileInputStream fileInputStream1 = new FileInputStream("dataKommercille.bin");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);

        FileInputStream fileInputStream2 = new FileInputStream("datavejbyggeri.bin");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);

        FileInputStream fileInputStream3 = new FileInputStream("dataindustri.bin");
        ObjectInputStream objectInputStream3 = new ObjectInputStream(fileInputStream3);

        Boligbyggerilist boligbyggerilist = (Boligbyggerilist) objectInputStream.readObject();
        Vejbygninglist vejbygninglist = (Vejbygninglist) objectInputStream2.readObject();
        Kommerciellelist kommerciellelist=(Kommerciellelist) objectInputStream1.readObject();
        Industrillelist industrillelist=(Industrillelist) objectInputStream3.readObject();


        controller.init( boligbyggerilist);
        controller.init( vejbygninglist);
        controller.init( kommerciellelist);
        controller.init( industrillelist);




        stage.setTitle("Bobs byggefirama!");
        stage.getIcons().add(new Image("Logo..png"));
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
