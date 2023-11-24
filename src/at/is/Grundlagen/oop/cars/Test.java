package at.is.Grundlagen.oop.cars;

public class Test {
    public static void main(String[] args) {
        Producer p1 = new Producer("BMW", "Deutschland", 5);

        Engine e1 = new Engine(980, Engine.type.Benzin);

        Car c1 = new Car("Schwarz", 316, 89000, 12, p1, e1);



    }
}
