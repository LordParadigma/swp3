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
        if (AnzahlGespielterLieder < 8){
            musik.get(random.nextInt(musik.size())).playMusik();
            for (int i = 0; i < musik.size(); i++) {
                musik.get(i).setGoing(true);
            }
            AnzahlGespielterLieder++;
        } else if (AnzahlGespielterLieder == 8){
            werbung.get(random.nextInt(werbung.size())).playAdd();
            AnzahlGespielterLieder = 0;
            play();
        }
    }

    public void stop(){
        if (AnzahlGespielterLieder == 8){
            werbung.get(random.nextInt(werbung.size())).stopAdd();
        } else {
            musik.get(random.nextInt(musik.size())).stopMusik();
            for (int i = 0; i < musik.size(); i++) {
                musik.get(i).setGoing(false);
            }
        }
    }

    public void skip(){
        if (skipMenge <= 6){
            System.out.print("Das Lied wurde überspringen. ");
            for (int i = 0; i < musik.size(); i++) {
                musik.get(i).setGoing(false);
            }
            play();
            for (int i = 0; i < musik.size(); i++) {
                musik.get(i).setGoing(true);
            }
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
}