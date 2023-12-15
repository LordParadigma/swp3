package at.is.Grundlagen.oop.Zoo;

public class Cat extends Animal{
    public Cat(int gewicht, int größe) {
        super(gewicht, größe);
    }

    public void meowen(int wiederholungen){
        for (int i = 0; i < wiederholungen; i++) {
            System.out.println("Meow");
        }
    }
}
