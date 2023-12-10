package at.is.Grundlagen.oop.geometrischeFiguren;

public class Quadrat extends Figur{

    public Quadrat(String sName) {
        super(sName);
    }

    public void Flächeninhalt(double dSeitenlänge){
        double dFächeninhalt = Math.pow(dSeitenlänge, 2);
        System.out.println("Der Flächeninhalt beträgt: " + dFächeninhalt + " LE^2");
    }
}
