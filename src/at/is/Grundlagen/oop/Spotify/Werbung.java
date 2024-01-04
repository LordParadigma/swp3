package at.is.Grundlagen.oop.Spotify;

public class Werbung {
    private int id;
    private String firma;
    private double länge;
    private boolean isGoing;

    public void playAdd(){
        isGoing = true;
        System.out.println("Wir sind " + firma + " und das ist unsere Werbung");
        isGoing = false;
    }

    public Werbung(int id, String name, double länge) {
        this.id = id;
        this.firma = name;
        this.länge = länge;
    }

    public String getFirma() {
        return firma;
    }

    public double getLänge() {
        return länge;
    }

    public int getId() {
        return id;
    }

    public boolean isGoing() {
        return isGoing;
    }
}
