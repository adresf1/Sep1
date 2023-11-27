package com.example.sep1;

public class Industrielle extends Projekt{

    private String type;

    public Industrielle(int forventetPris, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, String type) {
        super(forventetPris, forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger, projektTyupe);
        this.type = type;
    }


}
