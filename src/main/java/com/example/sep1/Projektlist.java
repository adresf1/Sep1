package com.example.sep1;

import java.util.ArrayList;

public class Projektlist {


    private ArrayList<Projekt> projekts;


public Projektlist(){
    projekts = new ArrayList<>();
    projekts.add(new Projekt(123,123,123,123,123,"hej"));
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


}
