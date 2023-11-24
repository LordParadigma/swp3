package at.is.Grundlagen.oop.cars;

public class Engine {
    private int ps;
    private type verbraucht;
    public enum type {Diesel, Benzin};

    public Engine(int ps, type verbraucht) {
        this.ps = ps;
        this.verbraucht = verbraucht;
    }

    public int getPs() {
        return ps;
    }

    public type getVerbraucht() {
        return verbraucht;
    }
}
