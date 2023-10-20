package Zahlengenerator;

import java.util.Random;
import java.util.Scanner;

public class Zahlengenerator1 {
    public static void main(String[] args){
        Random Zahl = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean abbruch = false;

        //System.out.println(Zahlengenerator);

        do {
            int Zahlengenerator = Zahl.nextInt(60);

            switch (Zahlengenerator) {
                case 1:
                    System.out.println("Ilic Stefan");
                    break;
                case 2:
                    System.out.println("Shagireev Ishan");
                    break;
                case 3:
                    System.out.println("Schuler Lukas");
                    break;
                case 4:
                    System.out.println("Grkovic Matej");
                    break;
                case 5:
                    System.out.println("Barfus Julian");
                    break;
                case 6:
                    System.out.println("Nada Abdalla");
                    break;
                case 7:
                    System.out.println("Dadak Ali");
                    break;
                case 8:
                    System.out.println("Nueßler Valentin");
                    break;
                case 9:
                    System.out.println("Yuezueak Enver");
                    break;
                case 10:
                    System.out.println("Keller Ruben");
                    break;
                case 11:
                    System.out.println("Keskin Egemen");
                    break;
                case 12:
                    System.out.println("Spiegel Fritz");
                    break;
                case 13:
                    System.out.println("Gmeinder Maximilian");
                    break;
                case 14:
                    System.out.println("Shekh-Mustafa Yahya");
                    break;
                case 15:
                    System.out.println("Tschaikner Patrick");
                    break;
                case 16:
                    System.out.println("Schwarzmann Paul");
                    break;
                case 17:
                    System.out.println("Pas Umut");
                    break;
                case 18:
                    System.out.println("Karacic Daniel");
                    break;
                case 19:
                    System.out.println("Katanic Nemanja");
                    break;
                case 20:
                    System.out.println("Alton Aiden");
                    break;
                case 21:
                    System.out.println("Nagel Jonas");
                    break;
                case 22:
                    System.out.println("Grosslercher Lukas");
                    break;
                case 23:
                    System.out.println("Beer Martin");
                    break;
                case 24:
                    System.out.println("Schahin Meeehmet (L pull)");
                    break;
                case 25:
                    System.out.println("Abive Wayne");
                    break;
                case 26:
                    System.out.println("Nagel Jonas");
                    break;
                case 27:
                    System.out.println("Nagel Jonas");
                    break;
                case 28:
                    System.out.println("Nagel Jonas");
                    break;
                case 29:
                    System.out.println("Nagel Jonas");
                    break;
                case 30:
                    System.out.println("Nagel Jonas");
                    break;
                case 31:
                    System.out.println("Nagel Jonas");
                    break;
                case 32:
                    System.out.println("Nagel Jonas");
                    break;
                case 33:
                    System.out.println("Nagel Jonas");
                    break;
                case 34:
                    System.out.println("Nagel Jonas");
                    break;
                case 35:
                    System.out.println("Nagel Jonas");
                    break;
                case 36:
                    System.out.println("Nagel Jonas");
                    break;
                case 37:
                    System.out.println("Nagel Jonas");
                    break;
                case 38:
                    System.out.println("Nagel Jonas");
                    break;
                case 39:
                    System.out.println("Nagel Jonas");
                    break;
                case 40:
                    System.out.println("Nagel Jonas");
                    break;
                case 41:
                    System.out.println("Nagel Jonas");
                    break;
                case 42:
                    System.out.println("Nagel Jonas");
                    break;
                case 43:
                    System.out.println("Nagel Jonas");
                    break;
                case 44:
                    System.out.println("Nagel Jonas");
                    break;
                case 45:
                    System.out.println("Nagel Jonas");
                    break;
                case 46:
                    System.out.println("Nagel Jonas");
                    break;
                case 47:
                    System.out.println("Nagel Jonas");
                    break;
                case 48:
                    System.out.println("Nagel Jonas");
                    break;
                case 49:
                    System.out.println("Nagel Jonas");
                    break;
                case 50:
                    System.out.println("Nagel Jonas");
                    break;
                case 51:
                    System.out.println("Nagel Jonas");
                    break;
                case 52:
                    System.out.println("Nagel Jonas");
                    break;
                case 53:
                    System.out.println("Nagel Jonas");
                    break;
                case 54:
                    System.out.println("Nagel Jonas");
                    break;
                case 55:
                    System.out.println("Nagel Jonas");
                    break;
                case 56:
                    System.out.println("Nagel Jonas");
                    break;
                case 57:
                    System.out.println("Nagel Jonas");
                    break;
                case 58:
                    System.out.println("Nagel Jonas");
                    break;
                case 59:
                    System.out.println("Nagel Jonas");
                    break;
                case 60:
                    System.out.println("Nagel Jonas");
                    break;
            }

            System.out.println("Wollen Sie das Programm beenden? 1(Ja) | 2(Nein)");
            int abfrage = scanner.nextInt();

            if(abfrage == 1){
                abbruch = true;
            }
        }while(abbruch != true);
    }
}