package at.is.Grundlagen.oop.Rechner;

import static java.lang.Math.sqrt;

public class Wurzelrechner extends Rechner{

    public void Wurzelziehen(double Radikand){
        double Wurzelwert = sqrt(Radikand);
        System.out.println("Das Ergebniss beträgt " + Wurzelwert);
    }
}
