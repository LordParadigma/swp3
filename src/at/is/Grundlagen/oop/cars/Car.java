package at.is.Grundlagen.oop.cars;

public class Car {
    private Producer hersteller;
    private Engine motor;
    private String farbe;
    private int maximalgeschwindigkeit;
    private float basispreis;
    private int basisverbrauch;

    public Car(String farbe, int maximalgeschwindigkeit, float basispreis, int basisverbrauch, Producer hersteller, Engine motor) {
        this.farbe = farbe;
        this.maximalgeschwindigkeit = maximalgeschwindigkeit;
        this.basispreis = basispreis;
        this.basisverbrauch = basisverbrauch;
        this.hersteller = hersteller;
        this.motor = motor;
    }

    public void BerechnungPreis(){

    }

    public void BerechnungVerbrauch(int gefahreneKilometer){

    }


    public String getFarbe() {
        return farbe;
    }

    public int getMaximalgeschwindigkeit() {
        return maximalgeschwindigkeit;
    }

    public float getBasispreis() {
        return basispreis;
    }

    public int getBasisverbrauch() {
        return basisverbrauch;
    }

    public void setBasisverbrauch(int basisverbrauch) {
        this.basisverbrauch = basisverbrauch;
    }
}
