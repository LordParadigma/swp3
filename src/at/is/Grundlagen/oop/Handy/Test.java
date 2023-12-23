package at.is.Grundlagen.oop.Handy;

public class Test {
    public static void main(String[] args) {
        Kamera kamera = new Kamera(Kamera.type.high);
        SIM sim = new SIM(1,"+43 676 5355787");
        SDKarte sdKarte = new SDKarte(1000);

        Handy handy = new Handy("Schwarz", sim, kamera, sdKarte);
        handy.takePicture("jpeg", "Baum");
        handy.makeCall("+123456789");
        handy.getFreeSpace();
        handy.printAllFiles();
    }
}
