package at.is.Grundlagen.oop.Auto_Video_bsp;

public class Test {
    public static void main(String[] args) {

        //simples Auto

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

        c4.TÜF();
        c4.drive(80);
    }
}
