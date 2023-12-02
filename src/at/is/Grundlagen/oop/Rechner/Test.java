package at.is.Grundlagen.oop.Rechner;

public class Test {
    public static void main(String[] args) {
        Rechner r1 = new Rechner();
        r1.Addition(8,12);
        r1.Subtraktion(65,5);
        r1.Multiplikation(4,0.5);
        r1.Division(100,25);

        WissenschaftlicherRechner wsr1 = new WissenschaftlicherRechner();
        wsr1.Cosinus(90);
        wsr1.Sinus(90);

        Wurzelrechner wr1 = new Wurzelrechner();
        wr1.Wurzelziehen(16);
    }
}
