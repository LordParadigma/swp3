package at.is.Grundlagen.Theorie;
import java.util.Random;

public class ControlStructurs3_1 {
    public static void main(String[] args) {

// Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int Zahl = random.nextInt(11 - 5) + 5;


// Wenn der Wert 10 ist gib aus Ten
// Wenn der Wert 9 ist gib aus Nine
// Wenn der Wert 8 ist gib aus Eight

        System.out.print(Zahl);

        switch (Zahl){
            case 10: System.out.print(" Ten"); break;
            case 9: System.out.print(" Nine"); break;
            case 8: System.out.print(" Eight"); break;
            case 7: System.out.print(" Seven"); break;
            case 6: System.out.print(" Six"); break;
            case 5: System.out.print(" Five"); break;
        }
    }
}