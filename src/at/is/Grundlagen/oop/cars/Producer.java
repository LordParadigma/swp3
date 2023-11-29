package at.is.Grundlagen.oop.cars;

public class Producer {
    private String name;
    private String herkunftsland;
    private double rabatt;

    public Producer(String name, String herkunftsland, double rabatt) {
        this.name = name;
        this.herkunftsland = herkunftsland;
        this.rabatt = rabatt;
    }

    public String getName() {
        return name;
    }

    public String getHerkunftsland() {
        return herkunftsland;
    }

    public double getRabatt() {
        return rabatt;
    }
}