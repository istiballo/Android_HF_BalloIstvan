package com.example.hazi4;

public class Penznem {
    int kepId;
    String rovidNev, Nev;
    Double vetelAr, eladasiAr;

    public Penznem(int kepId, String rovidNev, String nev, Double vetelAr, Double eladasiAr) {
        this.kepId = kepId;
        this.rovidNev = rovidNev;
        Nev = nev;
        this.vetelAr = vetelAr;
        this.eladasiAr = eladasiAr;
    }

    public int getKepId() {
        return kepId;
    }

    public void setKepId(int kepId) {
        this.kepId = kepId;
    }

    public String getRovidNev() {
        return rovidNev;
    }

    public void setRovidNev(String rovidNev) {
        this.rovidNev = rovidNev;
    }

    public String getNev() {
        return Nev;
    }

    public void setNev(String nev) {
        Nev = nev;
    }

    public Double getVetelAr() {
        return vetelAr;
    }

    public void setVetelAr(Double vetelAr) {
        this.vetelAr = vetelAr;
    }

    public Double getEladasiAr() {
        return eladasiAr;
    }

    public void setEladasiAr(Double eladasiAr) {
        this.eladasiAr = eladasiAr;
    }
}
