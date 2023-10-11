package at.is.Grundlagen.Theorie;

import java.sql.SQLOutput;
import java.util.Random;

public class While1 {
    public static void main (String[] args){

        //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und
        // die Summe der vorherigen Zufallszahlen ausgegeben!

        boolean Abbruch = false;
        Random random = new Random();
        int Summe = 0;

        while(!Abbruch){
            int Zahl = random.nextInt(21) + 10;

            if((Zahl == 15) || (Zahl == 25)){
                Abbruch = true;
            }

            else{
                System.out.println(Zahl + " +");
                Summe = Summe + Zahl;
            }

        }

        System.out.println("Summe = " + Summe);
    }
}
