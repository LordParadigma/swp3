package at.is.Grundlagen.oop.Auto_Video_bsp;

public class Tank {
    public enum TYPE {links, rechts};
    private int iFüllmenge;
    private TYPE position;

    public Tank(int iFüllmenge, TYPE position) {
        this.iFüllmenge = iFüllmenge;
        this.position = position;
    }

    public int getiFüllmenge() {
        return iFüllmenge;
    }

    public TYPE getPosition() {
        return position;
    }
}
