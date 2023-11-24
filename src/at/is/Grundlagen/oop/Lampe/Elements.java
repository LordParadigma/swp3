package at.is.Grundlagen.oop.Lampe;

public class Elements {
    private String name;
    private String farbe;
    private int stromverbrauch;
    private boolean statusOn;

    public Elements(String name, String farbe, int stromverbrauch, boolean statusOn) {
        this.name = name;
        this.farbe = farbe;
        this.stromverbrauch = stromverbrauch;
        this.statusOn = statusOn;
    }

    public void turnOn(){
        if (isStatusOn() == true){
            System.out.println("Mein Name ist " + getName() + ". Ich bin bereits eingeschaltet");
        } else {
            int erhöhung = getStromverbrauch() + 5;
            setStromverbrauch(erhöhung);
        }
    }

    public String getName() {
        return name;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getStromverbrauch() {
        return stromverbrauch;
    }

    public void setStromverbrauch(int stromverbrauch) {
        this.stromverbrauch = stromverbrauch;
    }

    public boolean isStatusOn() {
        return statusOn;
    }

    public void setStatusOn(boolean statusOn) {
        this.statusOn = statusOn;
    }
}
