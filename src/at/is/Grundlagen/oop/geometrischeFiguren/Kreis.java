package at.is.Grundlagen.oop.geometrischeFiguren;

public class Kreis extends Figur{

    public Kreis(String sName) {
        super(sName);
    }

    public void Flächeninhalt(double dRadius){
        double dFächeninhalt = Math.pow(dRadius, 2) * Math.PI;
        System.out.println("Der Flächeninhalt beträgt: " + dFächeninhalt + " LE^2");
    }
}
