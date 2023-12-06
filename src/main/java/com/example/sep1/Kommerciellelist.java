package com.example.sep1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Kommerciellelist implements Serializable {
    private ArrayList<Kommercielle> kommercielles;


    private DataSaver dataSaver;



  private Kommercielle selectedKommercielle;


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
  public Kommercielle getSelectedKommercielle()
  {
    return selectedKommercielle;
  }

  public void setSelectedKommercielle(Kommercielle selectedKommercielle)
  {
    this.selectedKommercielle = selectedKommercielle;
  }

    public void UpdateKommercielle(Kommercielle nyKommercielle, Kommercielle selectedKommercielle)
    {
        for (Kommercielle element: kommercielles)
        {
            //if(element.getNavn().equalsIgnoreCase(selectedBolig.getNavn()))
            if(element==selectedKommercielle)
            {
                element.update(nyKommercielle);
                break;
            }
        }
    }

}
