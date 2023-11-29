package at.is.Grundlagen.oop.cars;

public class RaceCar extends Car{
    private Wing flügel;
    public RaceCar(String farbe, int maximalgeschwindigkeit, float basispreis, double basisverbrauch, double tank, Producer hersteller, Engine motor, Wing flügel) {
        super(farbe, maximalgeschwindigkeit, basispreis, basisverbrauch, tank, hersteller, motor);
        this.flügel = flügel;
    }

    @Override
    public void Drive(double gefahreneKilometer) {
        double verbrauchberechnung = gefahreneKilometer / 90;
        double abzug = this.getBasisverbrauch() * verbrauchberechnung;
        double neuerTank = getTank() - abzug;
        setTank(neuerTank);
        System.out.println("Ich fahre und mein neuer Tank beträgt " + getTank() + " Liter");
    }

    public Wing getFlügel() {
        return flügel;
    }
}
