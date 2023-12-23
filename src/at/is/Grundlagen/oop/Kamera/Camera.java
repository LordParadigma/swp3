package at.is.Grundlagen.oop.Kamera;

public class Camera {
    private type pixel;
    public enum type {klein, mittel, groß}
    private int gewicht;
    private String farbe;
    private Producer hersteller;
    private Lens objektiv;
    private SDCard sdKarte;

    public void takePicture(type pixel, String name, String datum){
        int größe = 0;
        if (pixel == type.klein){
            größe = 2;
        } else if (pixel == type.mittel) {
            größe = 4;
        } else if (pixel == type.groß) {
            größe = 6;
        }
        if (sdKarte.getFreeSpace() > größe) {
            if (sdKarte.getFreeSpace() > 10) {
                if (pixel == type.klein) {
                    Files datei = new Files(name, datum, größe);
                    sdKarte.savePicture(datei);
                } else if (pixel == type.mittel) {
                    Files datei = new Files(name, datum, größe);
                    sdKarte.savePicture(datei);
                } else {
                    Files datei = new Files(name, datum, größe);
                    sdKarte.savePicture(datei);
                }
                System.out.println("Datei wurde gespeichert");
            } else if (sdKarte.getFreeSpace() < 10) {
                System.out.println("Speicherplatz gering!");
                if (pixel == type.klein) {
                    Files datei = new Files(name, datum, größe);
                    sdKarte.savePicture(datei);
                } else if (pixel == type.mittel) {
                    Files datei = new Files(name, datum, größe);
                    sdKarte.savePicture(datei);
                } else {
                    Files datei = new Files(name, datum, größe);
                    sdKarte.savePicture(datei);
                }
                System.out.println("Datei wurde gespeichert");
            }
        } else {
            System.out.println("Zu wenig Speicherplatz");
        }
    }

    public void printAllFiles(){
        sdKarte.getAllFiles();
        if (sdKarte.getDateien().size() == 0){
            System.out.println("Keine Dateien gespeichert");
        }
    }

    public void getFreeSpace() {
        System.out.println("Der freie Speicher beträgt: " + sdKarte.getFreeSpace());
    }

    public Camera(int gewicht, String farbe, Producer hersteller, Lens objektiv, SDCard sdKarte) {
        this.gewicht = gewicht;
        this.farbe = farbe;
        this.hersteller = hersteller;
        this.objektiv = objektiv;
        this.sdKarte = sdKarte;
    }

    public type getPixel() {
        return pixel;
    }

    public int getGewicht() {
        return gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    public Producer getHersteller() {
        return hersteller;
    }

    public Lens getObjektiv() {
        return objektiv;
    }

    public SDCard getSdKarte() {
        return sdKarte;
    }
}
