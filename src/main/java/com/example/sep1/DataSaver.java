package com.example.sep1;

import java.io.*;

public class DataSaver implements Serializable {
    public void saveData(Projektlist projektlist) throws IOException {
        File file = new File("data.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(projektlist);

    }
}
