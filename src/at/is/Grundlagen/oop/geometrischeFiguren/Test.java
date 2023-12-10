package at.is.Grundlagen.oop.geometrischeFiguren;

public class Test {
    public static void main(String[] args) {
        Kreis k1 = new Kreis("Kreis1");
        k1.Flächeninhalt(10);
        k1.NameAusgabe();

        Rechteck r1 = new Rechteck("Rechteck1");
        r1.Flächeninhalt(10, 8.5);
        r1.NameAusgabe();

        Quadrat q1 = new Quadrat("Quadrat1");
        q1.Flächeninhalt(5);
        q1.NameAusgabe();

        Würfel w1 = new Würfel("Würfel1");
        w1.Flächeninhalt(10);
        w1.Volumen(10);
        w1.NameAusgabe();
    }
}
