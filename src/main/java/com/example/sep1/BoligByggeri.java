package com.example.sep1;

import java.util.ArrayList;

public class  BoligByggeri extends Projekt{
    private int antalKekkener, antalBadeværelser, andreVærelser;

    public BoligByggeri(String navn, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, int antalKekkener, int antalBadeværelser, int andreVærelser) {
        super(navn, forventetTid,projektTyupe, størrelse, budget, mandeTimer, matriealeOmkostninger);
        this.antalKekkener = antalKekkener;
        this.antalBadeværelser = antalBadeværelser;
        this.andreVærelser = andreVærelser;
    }

    public int getAntalKekkener() {
        return antalKekkener;
    }

    public int getAntalBadeværelser() {
        return antalBadeværelser;
    }

    public int getAndreVærelser() {
        return andreVærelser;
    }

    private ArrayList<BoligByggeri> boligByggeris;

}
