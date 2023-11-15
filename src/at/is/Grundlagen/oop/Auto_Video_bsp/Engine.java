package at.is.Grundlagen.oop.Auto_Video_bsp;

import java.lang.reflect.Type;

public class Engine {
    public enum TYPE {Diesel, Benzin};
    private int iPS;
    private TYPE type;
    private int iVerbrauch;

    public Engine(int iPS, TYPE type, int iVerbrauch) {
        this.iPS = iPS;
        this.type = type;
        this.iVerbrauch = iVerbrauch;
    }

    public void drive(int amount){
        System.out.println("Der motor läuft mit " + amount);
    }


    public int getiPS() {
        return iPS;
    }

    public TYPE getType() {
        return type;
    }

    public int getiVerbrauch() {
        return iVerbrauch;
    }
}
