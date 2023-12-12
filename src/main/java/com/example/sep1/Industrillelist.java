package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Industrillelist implements Serializable {
    private ArrayList<Industrielle> industrielles;


    private DataSaver dataSaver;



    private Industrielle selectedIndustrielle;


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
    public Industrielle getSelectedIndustrielle()
    {
        return selectedIndustrielle;
    }

    public void setSelectedIndustrielle(Industrielle selectedIndustrielle)
    {
        this.selectedIndustrielle = selectedIndustrielle;
    }

    public void UpdateIndustrielle(Industrielle nyIndustrielle, Industrielle selectedIndustrielle)
    {
        for (Industrielle element: industrielles)
        {

            if(element==selectedIndustrielle)
            {
                element.update(nyIndustrielle);
                break;
            }
        }
    }
}