package at.is.Grundlagen.oop.Handy;

import java.util.Scanner;
public class HandyGUI {
    private Handy handy;

    public HandyGUI(Handy handy) {
        this.handy = handy;
    }

    public void run(){
        System.out.println("Willkommen");
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run == true){
            System.out.println("1. Anruff starten\n2. Bild machen\n3. freien Speicher ausgeben\n4. alle Dateien ausgeben\n5. gui beenden");
            int auswahl = scanner.nextInt();
            switch (auswahl){
                case 1:
                    System.out.println("Welche Nummer wollen Sie anrufen: ");
                    String nummer = scanner.next();
                    handy.makeCall(nummer);
                    break;
                case 2:
                    System.out.println("Wie soll das Bild heißen: ");
                    String name = scanner.next();
                    handy.takePicture(name);
                    break;
                case 3:
                    handy.getFreeSpace();
                    break;
                case 4:
                    handy.printAllFiles();
                    break;
                case 5:
                    System.out.println("gui wird beendet!");
                    run = false;
                    break;
            }
        }
    }
}
