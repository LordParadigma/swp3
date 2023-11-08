package at.is.Grundlagen.oop.Auto_Beispiel;

import java.util.ArrayList;

public class Auto {
    private int iLeistung = 0;
    private String sFarbe = "keine Farbe";
    private Fahrrad kofferraumfahrrad;
    private ArrayList<Getränkekiste> kofferraumgetränk = new ArrayList<Getränkekiste>();

    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public Fahrrad getKofferraumfahrrad() {
        return kofferraumfahrrad;
    }

    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        this.kofferraumfahrrad = kofferraumfahrrad;
    }

    public ArrayList<Getränkekiste> getKofferraumgetränk() {
        return kofferraumgetränk;
    }

    public void setKofferraumgetränk(Getränkekiste kofferraumgetränk) {
        this.kofferraumgetränk.add(kofferraumgetränk);
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }
}