package at.is.Grundlagen.oop.Handy;

public class Kamera {
    private type resolution;
    public enum type {low, medium, high};

    public HandyDatei makePicture(String name){
        int size = 0;
        if (resolution == type.low){
            size = 10;
        } else if (resolution == type.medium) {
            size = 50;
        } else if (resolution == type.high) {
            size = 120;
        }
        HandyDatei datei = new HandyDatei("png", size, name);
        return datei;
    }

    public Kamera(type resolution) {
        this.resolution = resolution;
    }

    public type getResolution() {
        return resolution;
    }
}
