package com.example.sep1;

public class VejBygning extends Projekt{
    private int længde, bredde, bro, tunnel;


    public VejBygning(int forventetPris, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, int længde, int bredde, int bro, int tunnel) {
        super(forventetPris, forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger, projektTyupe);
        this.længde = længde;
        this.bredde = bredde;
        this.bro = bro;
        this.tunnel = tunnel;
    }
}
