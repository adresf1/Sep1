package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Vejbygninglist implements Serializable {
    private ArrayList<VejBygning> vejBygnings;


    private DataSaver dataSaver;



    private VejBygning selectedVejbygning;


    public Vejbygninglist() {
        vejBygnings = new ArrayList<>();
        dataSaver = new DataSaver();
    }

    public void add(VejBygning vejBygning) {
        vejBygnings.add(vejBygning);
    }

    public void remove(VejBygning vejBygning) {
        vejBygnings.remove(vejBygning);
    }

    public ArrayList<VejBygning> getData() {
        return vejBygnings;
    }

    public VejBygning getSelectedVejbygning()
    {
        return selectedVejbygning;
    }

    public void setSelectedVejbygning(VejBygning selectedVejbygning)
    {
        this.selectedVejbygning = selectedVejbygning;
    }


    public void saveVejbygningData() throws IOException {
        dataSaver.savevejbygningdata(this);
    }
    public void UpdateVejbygning(VejBygning nyVejbygning, VejBygning selectedVejbygning)
    {
        for (VejBygning element: vejBygnings)
        {
            //if(element.getNavn().equalsIgnoreCase(selectedBolig.getNavn()))
            if(element==selectedVejbygning)
            {
                element.update(nyVejbygning);
                break;
            }
        }
    }

}
