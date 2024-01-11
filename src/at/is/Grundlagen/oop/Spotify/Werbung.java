package at.is.Grundlagen.oop.Spotify;

public class Werbung {
    private int id;
    private String firma;
    private double länge;
    private boolean isGoing;

    public void playAdd(){
        isGoing = true;
        System.out.println("WERBEPAUSE! Wir sind " + firma + " und das ist unsere Werbung");
    }

    public void stopAdd(){
        isGoing = false;
        System.out.println("Die Werbung wurde pausiert");
    }

    public Werbung(int id, String name, double länge) {
        this.id = id;
        this.firma = name;
        this.länge = länge;
    }
}
