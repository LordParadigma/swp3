package Zahlengenerator;
import java.util.Random;

public class Zahlengenerator1 {
    public static void main(String[] args){
        Random Zahl = new Random();
        int Zahlengenerator = Zahl.nextInt(25);

        System.out.println(Zahlengenerator);

        switch (Zahlengenerator){
            case 1: System.out.println("Ilic Stefan"); break;
            case 2: System.out.println("Shagireev Ishan"); break;
            case 3: System.out.println("Schuler Lukas"); break;
            case 4: System.out.println("Grkovic Matej"); break;
            case 5: System.out.println("Barfus Julian"); break;
            case 6: System.out.println("Nada Abdalla"); break;
            case 7: System.out.println("Dadak Ali"); break;
            case 8: System.out.println("Nueßler Valentin"); break;
            case 9: System.out.println("Yuezueak Enver"); break;
            case 10: System.out.println("Keller Ruben"); break;
            case 11: System.out.println("Keskin Egemen"); break;
            case 12: System.out.println("Spiegel Fritz"); break;
            case 13: System.out.println("Gmeinder Maximilian"); break;
            case 14: System.out.println("Shekh-Mustafa Yahya"); break;
            case 15: System.out.println("Tschaikner Patrick"); break;
            case 16: System.out.println("Schwarzmann Paul"); break;
            case 17: System.out.println("Pas Umut"); break;
            case 18: System.out.println("Karacic Daniel"); break;
            case 19: System.out.println("Katanic Nemanja"); break;
            case 20: System.out.println("Alton Aiden"); break;
            case 21: System.out.println("Nagel Jonas"); break;
            case 22: System.out.println("Grosslercher Lukas"); break;
            case 23: System.out.println("Beer Martin"); break;
            case 24: System.out.println("Sahin Mehmet"); break;
            case 25: System.out.println("Abive Wayne"); break;
        }
    }
}