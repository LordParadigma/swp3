package at.is.Grundlagen.Aufgaben;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        int i = countLetters();
        System.out.println(i);

        String result = reverseString();
        System.out.println(result);


    }
    public static boolean isPalindrom (String text){
        boolean report = false;


        return report;
    }

    public static int countLetters (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Von welchem Text wollen Sie einen Buchstaben auszählen (Ohne Leerzeichen): ");
        String text = scanner.next();

        char[] textArray = text.toCharArray();
        int count = 0;

        System.out.println("Nach welchem Buchstaben soll gesucht werden: ");
        String Str_search = scanner.next();
        char search = Str_search.charAt(0);

        for (int i = 0; i < textArray.length; i++) {
            if(textArray[i] == search){
                count ++;
            }
        }


        return count;
    }

    public static String reverseString (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Satz ein, den Sie umdrehen wollen (ohne Leerzeichen): ");
        String text = scanner.next();
        char[] textArray = text.toCharArray();
        char[] reverseText = textArray.clone();
        int j = 0;

        for (int i = textArray.length-1; i >= 0; i--) {
            reverseText[j] = textArray[i];
            j++;
        }
        return String.copyValueOf(reverseText);
    }
}
