package com.example.sep1;

public class Projekt {

    private int forventetPris, forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger;
    private String projektTyupe;

    public Projekt(int forventetPris, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe) {
        this.forventetPris = forventetPris;
        this.forventetTid = forventetTid;
        this.størrelse = størrelse;
        this.budget = budget;
        this.mandeTimer = mandeTimer;
        this.matriealeOmkostninger = matriealeOmkostninger;
        this.projektTyupe = projektTyupe;
    }
    public void setProjekt(int forventetPris, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe) {
        this.forventetPris = forventetPris;
        this.forventetTid = forventetTid;
        this.størrelse = størrelse;
        this.budget = budget;
        this.mandeTimer = mandeTimer;
        this.matriealeOmkostninger = matriealeOmkostninger;
        this.projektTyupe = projektTyupe;
    }

    public int getForventetPris() {
        return forventetPris;
    }

    public int getForventetTid() {
        return forventetTid;
    }

    public int getStørrelse() {
        return størrelse;
    }

    public int getBudget() {
        return budget;
    }

    public int getMandeTimer() {
        return mandeTimer;
    }

    public int getMatriealeOmkostninger() {
        return matriealeOmkostninger;
    }

    public String getProjektTyupe() {
        return projektTyupe;
    }




}
