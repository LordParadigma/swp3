package at.is.Grundlagen.Aufgaben;

import java.util.Scanner;
public class CäsarVerschlüsselung {
    public static void main(String[] args) {
        int auswahl = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Wollen sie verschlüsseln(1), entschlüsseln(2) oder das Programm beenden(3)");
            auswahl = scanner.nextInt();

            if(auswahl == 1) {
                String result = verschlüsseln();
                System.out.println(result);
            }
            else if(auswahl == 2) {
                String result2 = entschlüsseln();
                System.out.println(result2);
            }
            else if(auswahl == 3){
                System.out.println("Das Programm wird beendet");
            }
            else{
                System.out.println("ungültige Eingabe");
            }
        }while(auswahl != 3);
    }

    public static String verschlüsseln() {
        Scanner scanner = new Scanner(System.in);
        int shift = 0;
        String strVerschlüsseln = "";
        String verschlüsselt = "";

        System.out.println("Geben Sie den Satz ein, der verschlüsselt werden soll.");
        strVerschlüsseln = scanner.next();

        System.out.println("Um wie viele stellen soll der Satz verschoben werden ");
        shift = scanner.nextInt();

        char[] inputData = strVerschlüsseln.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int Buchstabe = inputData[i] + shift;
            verschlüsselt += Character.toString(Buchstabe);
        }

        return verschlüsselt;
    }

    public static String entschlüsseln() {
        Scanner scanner = new Scanner(System.in);
        int shift = 0;
        String strEntschlüsseln = "";
        String entschlüsselt = "";

        System.out.println("Geben Sie den Satz ein, der entschlüsselt werden soll.");
        strEntschlüsseln = scanner.next();

        System.out.println("Um wie viele stellen soll der Satz verschoben werden ");
        shift = scanner.nextInt();

        char[] inputData = strEntschlüsseln.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int Buchstabe = inputData[i] - shift;
            entschlüsselt += Character.toString(Buchstabe);
        }

        return entschlüsselt;
    }


}
