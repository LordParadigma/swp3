package at.is.Grundlagen.Aufgaben;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {

        //Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
        //Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        //1 Einzahlen
        //2 Abheben
        //3 Kontostand
        //4 Beenden

        Scanner scanner = new Scanner(System.in);

        double Kontostand = 0.0;
        boolean Abbruch = false;


        do {

            System.out.print("Was wollen Sie machen?\n1 Einzahlen\n2 Abheben\n3 Kontostand\n4 Beenden\n-----------------------\n");
            int Auswahl = scanner.nextInt();


            if (Auswahl == 1) {

                System.out.println("Wie viel wollen Sie einzahlen: ");
                double Einzahlung = scanner.nextDouble();
                Kontostand = Kontostand + Einzahlung;
                System.out.println("Ihr aktueller Kontostand beträgt: " + Kontostand + "€");


            } else if (Auswahl == 2) {

                System.out.println("Wie viel wollen Sie abheben: ");
                double Auszahlung = scanner.nextDouble();

                if(Auszahlung < Kontostand) {
                    Kontostand = Kontostand - Auszahlung;
                }

                else {
                    System.out.println("Sie verfügen nicht über ein genügendes Guthaben.");
                }
                System.out.println("Ihr aktueller Kontostand beträgt: " + Kontostand + "€");


            } else if (Auswahl == 3) {

                System.out.println("Ihr aktueller Kontostand beträgt: " + Kontostand + "€");


            } else if (Auswahl == 4) {
                System.out.println("Programm wird Beendet");
                Abbruch = true;


            } else {
                System.out.println("Ungültige Eingabe");
            }
        } while (Abbruch != true);
    }
}


