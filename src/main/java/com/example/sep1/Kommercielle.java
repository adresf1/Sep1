package com.example.sep1;

public class Kommercielle extends Projekt{

    private int antalEtager;
    private String type;

    public Kommercielle( int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, int antalEtager, String type) {
        super( forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger, projektTyupe);
        this.antalEtager = antalEtager;
        this.type = type;
    }




}
