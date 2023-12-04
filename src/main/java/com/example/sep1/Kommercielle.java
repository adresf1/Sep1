package com.example.sep1;

import java.io.Serializable;
import java.util.Objects;

public class Kommercielle extends Projekt implements Serializable
{

    private int antalEtager;
    private String type;

    public Kommercielle(String navn, int forventetTid, int størrelse, int budget, int mandeTimer, int antalEtager, String type) {
        super( navn, forventetTid, størrelse, budget, mandeTimer);
        this.antalEtager = antalEtager;
        this.type = type;
    }
    public Kommercielle(int budget, int forventetTid, int størrelse, String type, int antalEtager) {
        // Kalder superklassens konstruktør for at initialisere fælles attributter
        super("Default Navn", budget, forventetTid, størrelse, 0);
        this.antalEtager = antalEtager;
        this.type = type;
    }


public void setBudgetForKommercielle(int budget)
{
    setBudget(budget);
}
public void setForventettidKommercielle(int forventetTid)
{
    setForventetTid(forventetTid);
}
public void setStørrelseKommercielle(int størrelse)
{
    setStørrelse(størrelse);
}
public void setTypeKommercielle(String type)
{
    setProjektType(type);
}
public void setAntalEtager(int antalEtager)
{
    this.antalEtager = antalEtager;
}

    public String getType()
    {
        return type;
    }

    public int getAntalEtager()
    {
        return antalEtager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kommercielle that = (Kommercielle) o;
        return antalEtager == that.antalEtager && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(antalEtager, type);
    }
}
