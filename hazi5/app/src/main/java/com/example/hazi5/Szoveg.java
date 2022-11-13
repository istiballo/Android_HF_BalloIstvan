package com.example.hazi5;

public class Szoveg {
    int szin;
    String szoveg;

    public Szoveg(int szin, String szoveg) {
        this.szin = szin;
        this.szoveg = szoveg;
    }

    public int getSzin() {
        return szin;
    }

    public void setSzin(int szin) {
        this.szin = szin;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    @Override
    public String toString() {
        return this.getSzoveg();
    }
}
