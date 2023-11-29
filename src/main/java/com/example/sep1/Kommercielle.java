package com.example.sep1;

public class Kommercielle extends Projekt{

    private int antalEtager;
    private String type;

    public Kommercielle(int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger,String projektType, int antalEtager, String type) {
        super(forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger, projektType);
        this.antalEtager = antalEtager;
        this.type = type;
    }


//    public Kommercielle(int budget, int forventetTid, int størrelse, String type) {
//        super(forventetTid, størrelse, budget, 0, 0, "Default ProjektType");
//        this.antalEtager = 1;
//        this.type = type;
//    }

}
