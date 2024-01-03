package at.is.Grundlagen.oop.Ticketautomat;

public class Geldausgabe {

    public void rückgeld(double summe){
        if (summe == 0){
            System.out.println("Kein Rückgeld");
        } else {
            System.out.println("Das Rückgeld beträgt " + summe + "€");
        }
    }
}
