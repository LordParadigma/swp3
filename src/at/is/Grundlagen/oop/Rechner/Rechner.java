package at.is.Grundlagen.oop.Rechner;

public class Rechner {
    public void Addition(double Summand1, double Summand2){
        double Summe = Summand1 + Summand2;
        System.out.println("Das Ergebniss beträgt " + Summe);
    }

    public void Subtraktion(double Minuend, double Subtrahend){
        double Differenz = Minuend - Subtrahend;
        System.out.println("Das Ergebniss beträgt " + Differenz);
    }

    public void Multiplikation(double Faktor1, double Faktor2){
        double Produkt = Faktor1 * Faktor2;
        System.out.println("Das Ergebniss beträgt " + Produkt);
    }

    public void Division(double Dividend, double Divisor){
        double Quotient = Dividend / Divisor;
        System.out.println("Das Ergebniss beträgt " + Quotient);
    }
}
