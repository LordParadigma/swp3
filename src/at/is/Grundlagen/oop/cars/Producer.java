package at.is.Grundlagen.oop.cars;

public class Producer {
    private String name;
    private String herkunftsland;
    private float rabatt;

    public Producer(String name, String herkunftsland, float rabatt) {
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

    public float getRabatt() {
        return rabatt;
    }
}