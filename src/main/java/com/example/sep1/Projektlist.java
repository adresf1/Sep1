package com.example.sep1;

import java.io.*;
import java.util.ArrayList;

public class Projektlist implements Serializable {


    private ArrayList<Projekt> projekts;

    private Kommercielle kommercielledefault;

    private DataSaver dataSaver;


public Projektlist(){
    projekts = new ArrayList<>();
    dataSaver = new DataSaver();
}
public void add(Projekt projekt){
    projekts.add(projekt);
}

    public void remove(Projekt projekt){
        projekts.remove(projekt);
    }

    public ArrayList<Projekt> getData(){
        return projekts;
    }


    public void saveData() throws IOException {
    dataSaver.saveData(this);
    }
    public Kommercielle getKommercielledefault()
    {
        return kommercielledefault;
    }

    public void setKommercielledefault(Kommercielle kommercielledefault)
    {
        this.kommercielledefault = kommercielledefault;
    }

}
