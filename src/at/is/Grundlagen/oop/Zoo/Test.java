package at.is.Grundlagen.oop.Zoo;

public class Test {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Supercooler coolzoo", "Cool Zoo strasse 9bWI");

        Animal a1 = new Animal(20,60);
        Animal a2 = new Animal(50,20);

        Dog d1 = new Dog(20,30);

        Cat c1 = new Cat(10,15);

        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.addAnimal(d1);
        zoo.addAnimal(c1);

        zoo.printGewicht();

        c1.meowen(5);
        d1.bark(6);
        a1.move();
        a2.eat();

        zoo.printGewicht();
    }
}