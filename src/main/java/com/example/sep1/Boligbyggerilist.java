package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Boligbyggerilist implements Serializable {


    private ArrayList<BoligByggeri> boligByggeriss;

    private BoligByggeri selectedBolig;


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

    public BoligByggeri getSelectedBolig()
    {
        return selectedBolig;
    }

    public void setSelectedBolig(BoligByggeri selectedBolig)
    {
        this.selectedBolig = selectedBolig;
    }
    public void UpdateBolig(BoligByggeri nybolig, BoligByggeri selectedBolig)
    {
        for (BoligByggeri element: boligByggeriss)
        {
            //if(element.getNavn().equalsIgnoreCase(selectedBolig.getNavn()))
            if(element==selectedBolig)
            {
                element.update(nybolig);
                break;
            }
        }
    }
}