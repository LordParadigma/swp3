package at.is.Grundlagen.oop.cars;

public class RaceCar extends Car{
    private Wing flügel;
    public RaceCar(String farbe, int maximalgeschwindigkeit, float basispreis, double basisverbrauch, double tank, Producer hersteller, Engine motor, Wing flügel) {
        super(farbe, maximalgeschwindigkeit, basispreis, basisverbrauch, tank, hersteller, motor);
        this.flügel = flügel;
    }

    public Wing getFlügel() {
        return flügel;
    }
}
