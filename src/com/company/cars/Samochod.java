package com.company.cars;

import java.util.List;

public class Samochod {

    private String kolor;

    private String marka;

    private long cena;

    private long przebieg;

    private int rocznik;


    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public long getCena() {
        return cena;
    }

    public void setCena(long cena) {
        this.cena = cena;
    }

    public long getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(long przebieg) {
        this.przebieg = przebieg;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public Samochod(String kolor, String marka, long cena, long przebieg, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.cena = cena;
        this.przebieg = przebieg;
        this.rocznik = rocznik;


    }




}

