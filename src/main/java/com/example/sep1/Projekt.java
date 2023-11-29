package com.example.sep1;

public class Projekt {

    private int forventetPris, forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger;
    private String projektType;

    public Projekt(int forventetPris, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe) {
        this.forventetPris = forventetPris;
        this.forventetTid = forventetTid;
        this.størrelse = størrelse;
        this.budget = budget;
        this.mandeTimer = mandeTimer;
        this.matriealeOmkostninger = matriealeOmkostninger;
        this.projektType = projektTyupe;
    }
    public void setProjekt(int forventetPris, int forventetTid, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, String projektTyupe) {
        this.forventetPris = forventetPris;
        this.forventetTid = forventetTid;
        this.størrelse = størrelse;
        this.budget = budget;
        this.mandeTimer = mandeTimer;
        this.matriealeOmkostninger = matriealeOmkostninger;
        this.projektType = projektTyupe;
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

    public String getProjektType() {
        return projektType;
    }




}
