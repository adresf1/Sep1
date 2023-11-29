package com.example.sep1;

public class Kommercielle extends Projekt{

    private int antalEtager;
    private String type;

    public Kommercielle(String navn, int forventetTid, String projektTyupe, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, int antalEtager, String type) {
        super( navn, forventetTid,projektTyupe, størrelse, budget, mandeTimer, matriealeOmkostninger);
        this.antalEtager = antalEtager;
        this.type = type;
    }




}
