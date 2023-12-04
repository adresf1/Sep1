package com.example.sep1;

import java.io.*;

public class DataSaver implements Serializable {
    public void saveData(Boligbyggerilist boligbyggerilist) throws IOException {
        File file = new File("data.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(boligbyggerilist);
        objectOutputStream.close();

    }

    public void savevejbygningdata(Vejbygninglist vejbygninglist) throws IOException {
        File file = new File("datavejbyggeri.bin");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(vejbygninglist);
        objectOutputStream.close();


    }

    public void saveKommercielledata(Kommerciellelist kommerciellelist) throws IOException {
        File file = new File("dataKommercille.bin");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(kommerciellelist);
        objectOutputStream.close();


    }


    public void saveindustrilleData(Industrillelist industrillelist) throws IOException {
        File file = new File("dataindustri.bin");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(industrillelist);
        objectOutputStream.close();


    }
}
