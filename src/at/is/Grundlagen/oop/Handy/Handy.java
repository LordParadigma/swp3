package at.is.Grundlagen.oop.Handy;

public class Handy {
    private String color;
    private SIM simkarte;
    private Kamera kamera;
    private SDKarte sdKarte;

    public void takePicture(String name){
        sdKarte.saveFile(kamera.makePicture(name));
    }

    public void makeCall(String nummer){
        simkarte.doCall(nummer);
    }
    public void getFreeSpace() {
        System.out.println("Der freie Speicher beträgt: " + sdKarte.getFreeSpace());
    }
    public void printAllFiles(){
        sdKarte.getAllFiles();
    }


    public Handy(String color, SIM simkarte, Kamera kamera, SDKarte sdKarte) {
        this.color = color;
        this.simkarte = simkarte;
        this.kamera = kamera;
        this.sdKarte = sdKarte;
    }

    public String getColor() {
        return color;
    }
    public SIM getSimkarte() {
        return simkarte;
    }
    public Kamera getKamera() {
        return kamera;
    }
    public SDKarte getSdKarte() {
        return sdKarte;
    }

}
