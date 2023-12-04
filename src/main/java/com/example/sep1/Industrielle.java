package com.example.sep1;

import java.util.Objects;

public class Industrielle extends Projekt{

    private String type;



    public Industrielle(String navn, int forventetTid, int størrelse, int budget, int mandeTimer, String type) {
        super(navn, forventetTid, størrelse, budget, mandeTimer);
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
}
