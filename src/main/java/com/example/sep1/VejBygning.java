package com.example.sep1;

import java.util.Objects;

public class VejBygning extends Projekt{
    private int længde, bredde, bro, tunnel;


    public VejBygning(String navn, int budget,  int forventetTid, int størrelse, int mandeTimer,String Choicebox,  int længde, int bredde, int bro, int tunnel) {
        super( navn, budget, forventetTid, størrelse, mandeTimer,Choicebox);
        this.længde = længde;
        this.bredde = bredde;
        this.bro = bro;
        this.tunnel = tunnel;
    }

    public int getLængde() {
        return længde;
    }

    public int getBredde() {
        return bredde;
    }

    public int getBro() {
        return bro;
    }

    public int getTunnel() {
        return tunnel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VejBygning that = (VejBygning) o;
        return længde == that.længde && bredde == that.bredde && bro == that.bro && tunnel == that.tunnel;
    }



    public void update(Projekt other)
    {
        if(other instanceof VejBygning)
        {
            VejBygning vejBygning = (VejBygning) other;
            this.setNavn(vejBygning.getNavn());
            this.setBudget(vejBygning.getBudget());
            this.setForventetTid(vejBygning.getForventetTid());
            this.setStørrelse(vejBygning.getStørrelse());
            this.setMandeTimer(vejBygning.getMandeTimer());
            this.setChoicebox(vejBygning.getChoicebox());
            this.længde= vejBygning.getLængde();
            this.bredde=vejBygning.getBredde();
            this.bro=vejBygning.getBro();
            this.tunnel=vejBygning.getTunnel();
        }


    }


}
