package com.example.sep1;

import java.io.Serializable;
import java.util.Objects;

public class Kommercielle extends Projekt implements Serializable
{

    private int antalEtager;
    private String type;

    public Kommercielle(String navn,int budget, int forventetTid,int størrelse, int mandeTimer,String Choicebox, int antalEtager, String type) {
        super( navn, budget, forventetTid, størrelse, mandeTimer,Choicebox);
        this.antalEtager = antalEtager;
        this.type = type;
    }
//    public Kommercielle(int budget, int forventetTid, int størrelse, String type, int antalEtager) {
//        // Kalder superklassens konstruktør for at initialisere fælles attributter
//        super("Default Navn", budget, forventetTid, størrelse, 0);
//        this.antalEtager = antalEtager;
//        this.type = type;
//    }


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

    public void update(Projekt other)
    {
        if(other instanceof Kommercielle)
        {
            Kommercielle kommercielle = (Kommercielle) other;
            this.setNavn(kommercielle.getNavn());
            this.setBudget(kommercielle.getBudget());
            this.setMandeTimer(kommercielle.getMandeTimer());
            this.setForventetTid(kommercielle.getForventetTid());
            this.setStørrelse(kommercielle.getStørrelse());
            this.setChoicebox(kommercielle.getChoicebox());
            this.antalEtager = kommercielle.getAntalEtager();
            this.type = kommercielle.getType();
        }

    }
}
