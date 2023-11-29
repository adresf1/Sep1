package com.example.sep1;

public class  BoligByggeri extends Projekt{
    private int antalKekkener, antalBadeværelser, andreVærelser;

    public BoligByggeri( int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, int antalKekkener, int antalBadeværelser, int andreVærelser) {
        super( forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger, projektTyupe);
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
