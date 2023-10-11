package at.is.Grundlagen.Aufgaben;

import java.util.Random;
import java.util.Scanner;
public class Würfelspiel {
    public static void main(String[] args) {

        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int iBeenden = 0;

        do {
            System.out.println("------Spiel wird gestartet------");

            int PlayerWin = 0;
            int ComputerWin = 0;
            int Draws = 0;

            for (int i = 0; i < 6; i++) {

                int Computer = random.nextInt(6) + 1;
                int Player = random.nextInt(6) + 1;

                System.out.println("Computer: " + Computer + " | " + "Player: " + Player);

                if (Player > Computer) {
                    PlayerWin++;
                } else if (Player < Computer) {
                    ComputerWin++;
                } else {
                    Draws++;
                }

            }
            System.out.println("Player hat: " + PlayerWin + " mal gewonnen\n" +
                    "Computer hat: " + ComputerWin + " mal gewonnen\n" + "Es war " + Draws + " mal ein Unentschieden");

            System.out.println("Wollen Sie nochmal Spielen? (0 = nein)/(1 = ja)");
            iBeenden = scanner.nextInt();

            if(iBeenden == 0){
                System.out.println("Spiel wird beendet");
            }

        }while (iBeenden != 0);
    }
}