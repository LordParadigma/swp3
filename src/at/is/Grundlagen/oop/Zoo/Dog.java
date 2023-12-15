package at.is.Grundlagen.oop.Zoo;

public class Dog extends Animal{

    public Dog(int gewicht, int größe) {
        super(gewicht, größe);
    }

    public void bark(int wiederholungen){
        for (int i = 0; i < wiederholungen; i++) {
            System.out.println("Wuff");
        }
    }
}
