package com.example.sep1;

import java.io.*;

public class DataSaver implements Serializable {
    public void saveData(Boligbyggerilist boligbyggerilist) throws IOException {
        File file = new File("data.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(boligbyggerilist);

    }

    public void savevejbygningdata(Vejbygninglist vejbygninglist) throws IOException {
        File file = new File("data.bin");
        if (file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(vejbygninglist);


        }
    }

    public void saveKommercielledata(Kommerciellelist kommerciellelist) throws IOException {
        File file = new File("data.bin");
        if (file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(kommerciellelist);


        }
    }


    public void saveindustrilleData(Industrillelist industrillelist) throws IOException {
        File file = new File("data.bin");
        if (file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(industrillelist);


        }
    }
}
