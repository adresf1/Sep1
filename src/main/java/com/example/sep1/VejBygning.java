package com.example.sep1;

public class VejBygning extends Projekt{
    private int længde, bredde, bro, tunnel;


    public VejBygning(String navn, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe, int længde, int bredde, int bro, int tunnel) {
        super( navn, forventetTid, projektTyupe, størrelse, budget, mandeTimer, matriealeOmkostninger);
        this.længde = længde;
        this.bredde = bredde;
        this.bro = bro;
        this.tunnel = tunnel;
    }







}
