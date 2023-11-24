package at.is.Grundlagen.oop.Auto_Video_bsp;

public class Tires {
    private String saison;
    private int größe;
    private  String position;
    private String fürWetter;

    public Tires(String saison, int größe, String position, String fürWetter) {
        this.saison = saison;
        this.größe = größe;
        this.position = position;
        this.fürWetter = fürWetter;
    }

    public String getSaison() {
        return saison;
    }

    public int getGröße() {
        return größe;
    }

    public String getPosition() {
        return position;
    }

    public String getFürWetter() {
        return fürWetter;
    }
}
