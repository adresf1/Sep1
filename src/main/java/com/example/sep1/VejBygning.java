package com.example.sep1;

import java.util.Objects;

public class VejBygning extends Projekt{
    private int længde, bredde, bro, tunnel;


    public VejBygning(String navn, int forventetTid, int budget, int størrelse, int mandeTimer,  int længde, int bredde, int bro, int tunnel) {
        super( navn, forventetTid, størrelse, budget, mandeTimer);
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

    @Override
    public int hashCode() {
        return Objects.hash(længde, bredde, bro, tunnel);
    }


}
