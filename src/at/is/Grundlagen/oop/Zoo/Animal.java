package at.is.Grundlagen.oop.Zoo;

public class Animal {
    private int gewicht;
    private int größe;

    public void move(){
        System.out.println("Ich bewege mich");
        int neuesGewicht = getGewicht() - 2;
        setGewicht(neuesGewicht);
    }

    public void eat(){
        System.out.println("Ich esse");
        int neuesGewicht = getGewicht() + 2;
        setGewicht(neuesGewicht);
    }

    public Animal(int gewicht, int größe) {
        this.gewicht = gewicht;
        this.größe = größe;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getGröße() {
        return größe;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
