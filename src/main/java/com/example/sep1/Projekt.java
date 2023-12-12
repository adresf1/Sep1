package com.example.sep1;

import java.io.Serializable;
import java.util.Objects;
import javafx.scene.control.ChoiceBox;

public abstract class Projekt implements Serializable  {

    private int  forventetTid, størrelse, budget, mandeTimer;
    private String navn;

    private String Choicebox;


    public Projekt(String navn, int budget, int forventetTid, int størrelse, int mandeTimer, String Choicebox) {
        this.navn=navn;
        this.forventetTid = forventetTid;
        this.størrelse = størrelse;
        this.budget = budget;
        this.mandeTimer = mandeTimer;
        this.Choicebox = Choicebox;

    }

    public int getForventetTid() {
        return forventetTid;
    }

    public void setForventetTid(int forventetTid) {
        this.forventetTid = forventetTid;
    }

    public int getStørrelse() {
        return størrelse;
    }

    public void setStørrelse(int størrelse) {
        this.størrelse = størrelse;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getMandeTimer() {
        return mandeTimer;
    }

    public void setMandeTimer(int mandeTimer) {
        this.mandeTimer = mandeTimer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getChoicebox() {
        return Choicebox;
    }

    public void setChoicebox(String choicebox) {
        Choicebox = choicebox;
    }

    public abstract void update(Projekt other);

}
