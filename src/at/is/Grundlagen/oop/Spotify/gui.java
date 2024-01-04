package at.is.Grundlagen.oop.Spotify;

import java.util.Scanner;

public class gui {

    private Website website;

    public gui(Website website) {
        this.website = website;
    }

    public void run() {
        System.out.println("Willkomnen auf Spotify!");
        Scanner scanner = new Scanner(System.in);
        boolean abbruch = false;

        while (abbruch == false) {
            System.out.println("1. Abspielen\n2. Überspringen\n3. Skips zurücksetzen\n4. gui beenden");
            int auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    website.play();
                    break;
                case 2:
                    website.skip();
                    break;
                case 3:
                    System.out.println("Wann haben sie das letzte man geskipped");
                    int skipZeit = scanner.nextInt();
                    website.resetSkip(skipZeit);
                    break;
                case 4:
                    System.out.println("Spotify wird beendet!");
                    abbruch = true;
                    break;
            }
        }
    }
}