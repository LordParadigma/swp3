package at.is.Grundlagen.Theorie;
import java.util.Random;

public class ControlStructurs4 {
    public static void main(String[] args) {

// Erstelle zwei Zufallszahl zwischen 0 und 100
        Random random1 = new Random();
        int Zahl1 = random1.nextInt(100);

        Random random2 = new Random();
        int Zahl2 = random2.nextInt(100);

        System.out.println(Zahl1 + " und " + Zahl2);

// Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
// dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if((Zahl1 < Zahl2) && (Zahl1 < 50)){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

// Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
// dann gib aus "Eine der beiden ist kleiner als 30"
        else if((Zahl1 < 30) || (Zahl2 < 30)){
            System.out.println("Eine der beiden ist kleiner als 30");
        }

// Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
// dann gib aus "Erste Zahl klein, zweite kein 50iger"
        else if((Zahl1 < 50) && (Zahl2 != 50)){
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
        else{
            System.out.println("Bedingungen nicht erbracht");
        }







    }

}