package com.example.sep1;

public class Industrielle extends Projekt{

    private String type;

    public Industrielle(String navn, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, String type) {
        super(navn, forventetTid, projektTyupe, størrelse, budget, mandeTimer, matriealeOmkostninger);
        this.type = type;
    }


}
