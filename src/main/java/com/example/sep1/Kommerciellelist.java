package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Kommerciellelist implements Serializable {
    private ArrayList<Kommercielle> kommercielles;


    private DataSaver dataSaver;


    public Kommerciellelist() {
        kommercielles = new ArrayList<>();
        dataSaver = new DataSaver();
    }

    public void add(Kommercielle kommercielle) {
        kommercielles.add(kommercielle);
    }

    public void remove(Kommercielle kommercielle) {
        kommercielles.remove(kommercielle);
    }

    public ArrayList<Kommercielle> getData() {
        return kommercielles;
    }



   public void saveKommercielledata() throws IOException {
        dataSaver.saveKommercielledata(this);
    }

}
