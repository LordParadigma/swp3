package at.is.Grundlagen.Aufgaben;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean abbruch = false;
        boolean ende = false;
        int abbruch_abfrage = 0;

        System.out.println("Es handelt sich hier um ein simples TicTacToe spiel. " +
                "\nEs werden Zahlen von 0 bis 2 eingegeben. Die erste Zahl ist die Y-Koordinate \n" +
                "und die zweite Zahl ist die X-Koordinate. 0 0 wäre oben links und 2 2 wäre unten rechts");

        do {

            do{



            }while(ende != true);

            System.out.println("Menü:\nNeues Spiel -- 1\nProgramm beenden -- 2");
            abbruch_abfrage = scanner.nextInt();

            if(abbruch_abfrage == 1){
                System.out.println("New Game!");
            }
            else if (abbruch_abfrage == 2) {
                System.out.println("Programm wird beendet");
                abbruch = true;
            }
            else{
                System.out.println("ungültige Eingabe");
            }

        }while(abbruch != true);
    }

    public static void feld_eingabe(){




    }
}
