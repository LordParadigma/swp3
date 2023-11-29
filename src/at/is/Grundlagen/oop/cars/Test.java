package at.is.Grundlagen.oop.cars;

public class Test {
    public static void main(String[] args) {
        Producer p1 = new Producer("BMW", "Deutschland", 4.85);
        Engine e1 = new Engine(480, Engine.type.Benzin);

        Car c1 = new Car("Schwarz", 297, 89000, 12, 120,p1, e1);

        c1.BerechnungPreis();
        c1.BerechnungVerbrauch(1654000);
        c1.Drive(100);



        Producer p2 = new Producer("Mercedes", "Deutschland", 6.50);
        Engine e2 = new Engine(820, Engine.type.Benzin);
        Trailer tr1 = new Trailer("TR123", "Grau", 4, 260);

        Truck t1 = new Truck("Weiß", 268, 186999, 16, 160, p2, e2, tr1);

        t1.BerechnungPreis();
        t1.BerechnungVerbrauch(1680);
        t1.Drive(200);



        Producer p3 = new Producer("McLaren", "England", 3.15);
        Engine e3 = new Engine(1350, Engine.type.Diesel);
        Wing w1 = new Wing("W123", "Carbon", 16);

        RaceCar rc1 = new RaceCar("Blau", 329, 290000, 18, 90, p3, e3, w1);

        rc1.BerechnungPreis();
        rc1.BerechnungVerbrauch(28000);
        rc1.Drive(150);
    }
}
