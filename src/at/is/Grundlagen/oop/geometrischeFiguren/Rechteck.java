package at.is.Grundlagen.oop.geometrischeFiguren;

public class Rechteck extends Figur{

    public Rechteck(String sName) {
        super(sName);
    }

    public void Flächeninhalt(double dLänge, double dBreite){
        double dFächeninhalt = dBreite * dLänge;
        System.out.println("Der Flächeninhalt beträgt: " + dFächeninhalt + " LE^2");
    }
}
