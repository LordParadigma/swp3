package at.is.Grundlagen.oop.Kamera;

public class LensProducer {
    private String name;
    private String country;

    public LensProducer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}