package at.is.Grundlagen.oop.Rechner;


import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class WissenschaftlicherRechner extends Rechner{
    public void Sinus(double Zahl){
        double Ergebniss = sin(Zahl);
        System.out.println("Das Ergebniss beträgt " + Ergebniss);
    }

    public void Cosinus(double Zahl){
        double Ergebniss = cos(Zahl);
        System.out.println("Das Ergebniss beträgt " + Ergebniss);
    }
}