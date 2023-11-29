package at.is.Grundlagen.oop.Auto_Video_bsp;

public class Test {
    public static void main(String[] args) {

        //simples Auto

        /*
        Car c1 = new Car();
        c1.setsMarke("Audi");
        c1.setfBenzinVerbrauch(7);
        c1.setsSeriennummer("A1234");
        c1.setfBenzinMenge(70);
        c1.setfTankgröße(100);


        Car c2 = new Car();
        c2.setsMarke("Mercedes");
        c2.setfBenzinVerbrauch(6);
        c2.setsSeriennummer("M1234");
        c2.setfBenzinMenge(20);
        c2.setfTankgröße(80);


       Car c3 = new Car(6,"Bugaai","ABC123");



       //Auto mit Engine

        Engine e1 = new Engine(760, Engine.TYPE.Benzin, 8);
        Tank t1 = new Tank(80, Tank.TYPE.links);
        Car c4 = new Car("BMW", "A12356", e1, t1);

        c4.drive(54);
        c4.TÜF();

        Engine e2 = new Engine(920, Engine.TYPE.Diesel, 12, 90);
        Tank t2 = new Tank(120, Tank.TYPE.rechts);
        Car c5 = new Car("Mercedes", "B987654", e2, t2);

        RearMirror r1r = new RearMirror(90, "rechts");
        RearMirror r1l = new RearMirror(90, "links");
        Tires t1vl = new Tires("Sommer", 27, "vorne links", "trocken");
        Tires t1vr = new Tires("Sommer", 27, "vorne rechts", "trocken");
        Tires t1hl = new Tires("Sommer", 27, "hinten links", "trocken");
        Tires t1hr = new Tires("Sommer", 27, "hinten rechts", "trocken");

        c5.addMirror(r1l);
        c5.addMirror(r1r);
        c5.addTires(t1vl);
        c5.addTires(t1vr);
        c5.addTires(t1hl);
        c5.addTires(t1hr);
         */

        Engine e1 = new Engine(860, Engine.TYPE.Diesel, 9, 99);
        RearMirror r1 = new RearMirror(90, "Hinten");
        Tank t1 = new Tank(9000, Tank.TYPE.rechts);
        Tires tr1 = new Tires("Sommer", 10, "Vorne Links", "Trocken");

        Car c1 = new Car("BMW", "ABC123", e1, t1);

        c1.addTires(tr1);
        c1.addMirror(r1);

        c1.TÜF();
        c1.drive(e1.getiBetriebsleitung());
        c1.honk(8);
    }
}
