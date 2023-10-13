package at.is.Grundlagen.Aufgaben;

public class StringHelper {

    public static void main(String[] args) {
        int i = countLetters("Ishan ist voll cool", 'o');
        System.out.println(i);

        String result = reverseString("Hallo");
        System.out.println(result);


    }
    public static boolean isPalindrom (String text){
        boolean report = false;


        return report;
    }

    public static int countLetters (String text, char search){

        char[] textArray = text.toCharArray();
        int count = 0;

        for (int i = 0; i < textArray.length; i++) {
            if(textArray[i] == search){
                count ++;
            }
        }


        return count;
    }

    public static String reverseString (String text){

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
