package at.is.Grundlagen.oop.Rechner;

import static java.lang.Math.*;

public class WissenschaftlicherRechner extends Rechner{
    public void Sinus(double Zahl){
        double Ergebniss = sin(toRadians(Zahl));
        System.out.println("Das Ergebniss beträgt " + Ergebniss);
    }

    public void Cosinus(double Zahl){
        double Ergebniss = cos(toRadians(Zahl));
        System.out.println("Das Ergebniss beträgt " + Ergebniss);
    }
}