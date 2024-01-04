package at.is.Grundlagen.oop.Spotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Website {
    private int skipMenge = 0;
    int SkipTimer = 60;
    int AnzahlGespielterLieder = 0;
    private List<Werbung> werbung;
    private List<Musik> musik;
    Random random = new Random();


    public void play(){
        if (AnzahlGespielterLieder <= 8){
            musik.get(random.nextInt(musik.size() + 1)).playMusik();
            AnzahlGespielterLieder++;
        } else {
            werbung.get(random.nextInt(werbung.size())).playAdd();
            AnzahlGespielterLieder = 0;
        }
    }

    public void skip(){
        if (skipMenge <= 6){
            System.out.print("Das Lied wurde überspringen. ");
            play();
            skipMenge++;
        }else {
            System.out.println("Sie haben ihr Skip-Limet für diese Stunde erreicht!");
        }
    }

    public void resetSkip(int zeitSeitErstemSkip){
        if (zeitSeitErstemSkip >=  SkipTimer){
            skipMenge = 0;
            System.out.println("Die Skips haben sich zurückgesetzt");
            SkipTimer = 60;
        } else {
            SkipTimer -= zeitSeitErstemSkip;
            System.out.println("Die benötigte Zeit wurde noch nicht erreicht");
        }
    }

    public void addMusik(Musik musik){
        this.musik.add(musik);
    }

    public void addWerbung(Werbung werbung){
        this.werbung.add(werbung);
    }

    public Website() {
        this.werbung = new ArrayList<>();
        this.musik = new ArrayList<>();
    }

    public int getSkipMenge() {
        return skipMenge;
    }

    public int getSkipTimer() {
        return SkipTimer;
    }

    public List<Werbung> getWerbung() {
        return werbung;
    }

    public List<Musik> getMusik() {
        return musik;
    }

    public int getAnzahlGespielterLieder() {
        return AnzahlGespielterLieder;
    }

    public Random getRandom() {
        return random;
    }


}