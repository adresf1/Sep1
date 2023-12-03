package com.example.sep1;

public class Industrielle extends Projekt{

    private String type;



    public Industrielle(String navn, int forventetTid, int størrelse, int budget, int mandeTimer, String type) {
        super(navn, forventetTid, størrelse, budget, mandeTimer);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
