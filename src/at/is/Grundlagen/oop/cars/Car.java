package at.is.Grundlagen.oop.cars;

public class Car {
    private Producer hersteller;
    private Engine motor;
    private String farbe;
    private int maximalgeschwindigkeit;
    private float basispreis;
    private double basisverbrauch;
    private double tank;

    public Car(String farbe, int maximalgeschwindigkeit, float basispreis, double basisverbrauch, double tank, Producer hersteller, Engine motor) {
        this.farbe = farbe;
        this.maximalgeschwindigkeit = maximalgeschwindigkeit;
        this.basispreis = basispreis;
        this.basisverbrauch = basisverbrauch;
        this.tank = tank;
        this.hersteller = hersteller;
        this.motor = motor;
    }

    public void BerechnungPreis(){
        double endpreis = basispreis - basispreis / 100 * hersteller.getRabatt();
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

    public void Drive(double gefahreneKilometer){
        double verbrauchberechnung = gefahreneKilometer / 100;
        double abzug = basisverbrauch * verbrauchberechnung;
        double neuerTank = tank - abzug;
        tank = neuerTank;
        System.out.println("Ich fahre und mein neuer Tank beträgt " + tank + " Liter");
    }

    public void Bremse(){
        System.out.println("Ich bremse");
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

    public Producer getHersteller() {
        return hersteller;
    }

    public Engine getMotor() {
        return motor;
    }

    public double getTank() {
        return tank;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }
}
