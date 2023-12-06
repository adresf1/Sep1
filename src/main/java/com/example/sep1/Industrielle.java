package com.example.sep1;

import java.util.Objects;

public class Industrielle extends Projekt{

    private String type;



    public Industrielle(String navn, int budget,int forventetTid, int størrelse, int mandeTimer, String type) {
        super(navn, budget, forventetTid, størrelse , mandeTimer);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Industrielle that = (Industrielle) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    public void update(Projekt other)
    {
        if(other instanceof  Industrielle)
        {
            Industrielle industrielle = (Industrielle) other;
            this.setNavn(industrielle.getNavn());
            this.setBudget(industrielle.getBudget());
            this.setMandeTimer(industrielle.getMandeTimer());
            this.setStørrelse(industrielle.getStørrelse());
            this.setForventetTid(industrielle.getForventetTid());
            this.type=industrielle.getType();
        }
    }
}
