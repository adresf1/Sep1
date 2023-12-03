package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Industrillelist implements Serializable {
    private ArrayList<Industrielle> industrielles;


    private DataSaver dataSaver;


    public Industrillelist() {
        industrielles = new ArrayList<>();
        dataSaver = new DataSaver();
    }

    public void add(Industrielle industrielle) {
        industrielles.add(industrielle);
    }

    public void remove(Industrielle industrielle) {
        industrielles.remove(industrielle);
    }

    public ArrayList<Industrielle> getData() {
        return industrielles;
    }


    public void saveindustrilleData() throws IOException {
        dataSaver.saveindustrilleData(this);
    }
}