package com.example.sep1;

import java.io.Serializable;

public class Kommercielle extends Projekt implements Serializable
{

    private int antalEtager;
    private String type;

    public Kommercielle(String navn, int forventetTid, String projektTyupe, int størrelse, int budget, int mandeTimer, int matriealeOmkostninger, int antalEtager, String type) {
        super( navn, forventetTid,projektTyupe, størrelse, budget, mandeTimer, matriealeOmkostninger);
        this.antalEtager = 0;
        this.type = type;
    }
    public Kommercielle(int budget, int forventetTid, int størrelse, String type, int antalEtager) {
        // Kalder superklassens konstruktør for at initialisere fælles attributter
        super("Default Navn", budget, "Default ProjektType", forventetTid, størrelse, 0, 0);
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

}
