package at.is.Grundlagen.oop.cars;

public class Car {
    private Producer hersteller;
    private Engine motor;
    private String farbe;
    private int maximalgeschwindigkeit;
    private float basispreis;
    private double basisverbrauch;

    public Car(String farbe, int maximalgeschwindigkeit, float basispreis, double basisverbrauch, Producer hersteller, Engine motor) {
        this.farbe = farbe;
        this.maximalgeschwindigkeit = maximalgeschwindigkeit;
        this.basispreis = basispreis;
        this.basisverbrauch = basisverbrauch;
        this.hersteller = hersteller;
        this.motor = motor;
    }

    public void BerechnungPreis(){
        float endpreis = basispreis - basispreis / 100 * hersteller.getRabatt();
        System.out.println("Der Preis fürs Auto mit dem Rabatt beträgt " + endpreis + "€");
    }

    public void BerechnungVerbrauch(int gefahreneKilometer){
        if (motor.getVerbraucht().equals(Engine.type.Benzin)){
            if (gefahreneKilometer > 50000){
                double erhöhung = basisverbrauch / 100 * 9.8;
                double endverbrauch = basisverbrauch + erhöhung;
                System.out.println("Der neue Verbrauch beträgt " + endverbrauch);
            } else {
                System.out.println("Der Verbrauch beträgt immernoch " + basisverbrauch);
            }
        } else {
            System.out.println("Der Verbrauch von Diesel-Motoren erhöht sich nicht");
        }
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

    public double getBasisverbrauch() {
        return basisverbrauch;
    }

    public void setBasisverbrauch(int basisverbrauch) {
        this.basisverbrauch = basisverbrauch;
    }
}
