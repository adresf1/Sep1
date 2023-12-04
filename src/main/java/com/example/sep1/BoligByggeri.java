package com.example.sep1;

import java.util.ArrayList;
import java.util.Objects;

public class  BoligByggeri extends Projekt {
    private int antalKekkener, antalBadeværelser, andreVærelser;
    private String status;

    public BoligByggeri(String navn, int budget, int forventetTid, int størrelse, int mandeTimer, int antalKekkener, int antalBadeværelser, int andreVærelser, String status) {
        super(navn, budget, forventetTid, størrelse, mandeTimer);
        this.antalKekkener = antalKekkener;
        this.antalBadeværelser = antalBadeværelser;
        this.andreVærelser = andreVærelser;
        this.status=status;

    }

    public int getAntalKekkener() {
        return antalKekkener;
    }

    public int getAntalBadeværelser() {
        return antalBadeværelser;
    }

    public int getAndreVærelser() {
        return andreVærelser;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoligByggeri that = (BoligByggeri) o;
        return antalKekkener == that.antalKekkener && antalBadeværelser == that.antalBadeværelser && andreVærelser == that.andreVærelser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(antalKekkener, antalBadeværelser, andreVærelser);
    }

}


