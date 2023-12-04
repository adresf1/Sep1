package com.example.sep1;

import java.io.Serializable;
import java.util.Objects;

public class Projekt implements Serializable  {

    private int  forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger;
    private String navn, projektType;

    public Projekt(String navn, int budget, int forventetTid, int størrelse, int mandeTimer) {
        this.navn=navn;
        this.forventetTid = forventetTid;

        this.størrelse = størrelse;
        this.budget = budget;
        this.mandeTimer = mandeTimer;

    }
    public void setProjekt( int forventetTid, int størrelse, int budget, int mandeTimer) {

        this.forventetTid = forventetTid;
        this.størrelse = størrelse;
        setBudget(this.budget);
        this.mandeTimer = mandeTimer;

    }
    public void setBudget(int Nybudget)
    {
        this.budget = Nybudget;
    }

    public void setForventetTid(int forventetTid)
    {
        this.forventetTid = forventetTid;
    }

    public void setStørrelse(int størrelse)
    {
        this.størrelse = størrelse;
    }

    public void setProjektType(String projektType)
    {
        this.projektType = projektType;
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


    public String getNavn() {
        return navn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projekt projekt = (Projekt) o;
        return forventetTid == projekt.forventetTid && størrelse == projekt.størrelse && budget == projekt.budget && mandeTimer == projekt.mandeTimer && matriealeOmkostninger == projekt.matriealeOmkostninger && Objects.equals(navn, projekt.navn) && Objects.equals(projektType, projekt.projektType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forventetTid, størrelse, budget, mandeTimer, matriealeOmkostninger, navn, projektType);
    }
}
