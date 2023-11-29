package com.example.sep1;

import java.util.ArrayList;

public class Projektlist {


    private ArrayList<Projekt> projekts;


public Projektlist(){
    projekts = new ArrayList<>();

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
