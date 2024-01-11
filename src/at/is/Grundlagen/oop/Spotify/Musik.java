package at.is.Grundlagen.oop.Spotify;

public class Musik {
    private int id;
    private String sänger;
    private String name;
    private double länge;
    private String genre;
    private boolean isGoing;

    public void playMusik(){
        if (isGoing == false) {
            System.out.println("Das Lied " + name + " von " + sänger + " läuft jetzt");
        } else if (isGoing == true){
            System.out.println("Es läuft schon Musik!");
        }
    }

    public void stopMusik(){
        if (isGoing == true){
            isGoing = false;
            System.out.println("Die Musik wurde pausiert!");
        } else {
            System.out.println("Es läuft keine Musik!");
        }
    }

    public Musik(int id, String sänger, double länge, String name, String genre) {
        this.id = id;
        this.sänger = sänger;
        this.länge = länge;
        this.name = name;
        this.genre = genre;
    }

    public void setGoing(boolean going) {
        isGoing = going;
    }
}
