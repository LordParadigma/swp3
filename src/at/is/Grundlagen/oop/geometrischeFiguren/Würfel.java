package at.is.Grundlagen.oop.geometrischeFiguren;

public class Würfel extends Quadrat{
    public Würfel(String sName) {
        super(sName);
    }

    public void Volumen(double dSeitenlänge){
        double dVolumen = Math.pow(dSeitenlänge, 3);
        System.out.println("Das Volumen des Würfels beträgt " + dVolumen + " LE^3");
    }
}
