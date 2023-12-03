package com.example.sep1;

import java.util.ArrayList;

public class  BoligByggeri extends Projekt {
    private int antalKekkener, antalBadeværelser, andreVærelser;

    public BoligByggeri(String navn, int budget, int forventetTid, int størrelse, int mandeTimer, int antalKekkener, int antalBadeværelser, int andreVærelser) {
        super(navn, budget, forventetTid, størrelse, mandeTimer);
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
}


