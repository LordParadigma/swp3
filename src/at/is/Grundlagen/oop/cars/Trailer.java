package at.is.Grundlagen.oop.cars;

public class Trailer {
    private String seriennummer;
    private String farbe;
    private int reifen;
    private int gewicht;

    public Trailer(String seriennummer, String farbe, int reifen, int gewicht) {
        this.seriennummer = seriennummer;
        this.farbe = farbe;
        this.reifen = reifen;
        this.gewicht = gewicht;
    }

    public String getSeriennummer() {
        return seriennummer;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getReifen() {
        return reifen;
    }

    public int getGewicht() {
        return gewicht;
    }
}
