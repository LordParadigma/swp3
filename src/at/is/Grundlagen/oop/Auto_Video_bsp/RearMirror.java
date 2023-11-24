package at.is.Grundlagen.oop.Auto_Video_bsp;

public class RearMirror {
    private int größe;
    private String position;

    public RearMirror(int größe, String position) {
        this.größe = größe;
        this.position = position;
    }

    public int getGröße() {
        return größe;
    }

    public String getPosition() {
        return position;
    }
}
