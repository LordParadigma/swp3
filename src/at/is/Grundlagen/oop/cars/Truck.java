package at.is.Grundlagen.oop.cars;

import java.util.TreeMap;

public class Truck extends Car{

    private Trailer anhänger;
    public Truck(String farbe, int maximalgeschwindigkeit, float basispreis, double basisverbrauch, double tank, Producer hersteller, Engine motor, Trailer anhänger) {
        super(farbe, maximalgeschwindigkeit, basispreis, basisverbrauch, tank, hersteller, motor);
        this.anhänger = anhänger;
    }

    public Trailer getAnhänger() {
        return anhänger;
    }
}
