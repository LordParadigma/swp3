package at.is.Grundlagen.Aufgaben;

import java.util.Scanner;
import java.util.Random;

public class WörterRaten {

    public static void main(String[] args) {
        System.out.println("In diesem Programm sollen Sie Wörter erraten. Beachten Sie, dass es keine Sonderzeichen gibt. Umlaute werden nicht als ä sonder als ae angegeben.");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int iWiederholung = 0;




        do {
            boolean Worterraten = false;
            do {

                String vWort = WortAuswahl();
                char[] Wort = vWort.toCharArray();

                for (int i = 0; i < Wort.length; i++) {
                    System.out.println(Wort[i]);
                }

                Worterraten = true;
            }while (Worterraten != true);

            System.out.println("Wollen Sie ein neues Wort erraten? 1-ja/2-nein");
            iWiederholung = scanner.nextInt();

            if (iWiederholung == 1) {
                System.out.println("Viel Spaß beim raten!");
            } else if (iWiederholung == 2) {
                System.out.println("Programm wird beendet!");
            } else {
                System.out.println("Ungültige Eingabe! Programm wird beendet!");
            }
        }while (iWiederholung == 1);
    }


    public static String WortAuswahl() {
        Random random = new Random();
        int iWortwahl = random.nextInt(15);
        String Wort = "";

        switch (iWortwahl) {
            case 0:
                Wort = "Hausverstand";
                break;
            case 1:
                Wort = "Schwaerzler";
                break;
            case 2:
                Wort = "Mathematik";
                break;
            case 3:
                Wort = "Haemmerle";
                break;
            case 4:
                Wort = "Zahnbuerste";
                break;
            case 5:
                Wort = "Brotschneidemaschine";
                break;
            case 6:
                Wort = "Immigration";
                break;
            case 7:
                Wort = "wechselhaftig";
                break;
            case 8:
                Wort = "Willkommensfeier";
                break;
            case 9:
                Wort = "Hochgeschwindigkeitsstahl";
                break;
            case 10:
                Wort = "Lichtgeschwindigkeit";
                break;
            case 11:
                Wort = "Hyperinflation";
                break;
            case 12:
                Wort = "Homosexualitaet";
                break;
            case 13:
                Wort = "cashflow"; //kann auch gewollt sein
                break;
            case 14:
                Wort = "Xatar";
                break;
            case 15:
                Wort = "Pommesabteilung";
                break;
        }

        return Wort;
    }

}
