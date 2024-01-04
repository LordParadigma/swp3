package at.is.Grundlagen.oop.Spotify;

public class Musik {
    private int id;
    private String sänger;
    private String name;
    private double länge;
    private String genre;
    private boolean isGoing;

    public void playMusik(){
        isGoing = true;
        System.out.println("Das Lied " + name + " von " + sänger + " läuft gerade!");
        isGoing = false;
    }

    public Musik(int id, String sänger, double länge, String name, String genre) {
        this.id = id;
        this.sänger = sänger;
        this.länge = länge;
        this.name = name;
        this.genre = genre;
    }

    public String getSänger() {
        return sänger;
    }

    public double getLänge() {
        return länge;
    }

    public String getGenre() {
        return genre;
    }
}
