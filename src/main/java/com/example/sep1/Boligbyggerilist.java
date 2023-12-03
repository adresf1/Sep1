package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Boligbyggerilist implements Serializable {


    private ArrayList<BoligByggeri> boligByggeriss;


    private DataSaver dataSaver;


    public Boligbyggerilist() {
        boligByggeriss = new ArrayList<>();
        dataSaver = new DataSaver();
    }

    public void add(BoligByggeri boligByggeri) {
        boligByggeriss.add(boligByggeri);
    }

    public void remove(BoligByggeri boligByggeri) {
        boligByggeriss.remove(boligByggeri);
    }

    public ArrayList<BoligByggeri> getData() {
        return boligByggeriss;
    }


    public void saveData() throws IOException {
        dataSaver.saveData(this);
    }
}