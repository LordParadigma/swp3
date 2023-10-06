package at.is.Grundlagen.Theorie;

public class Loop1 {
    public static void main(String[] args) {

        //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        int a = 0;

        for (int i = 0; i <= 100; i++) {

            a = a + i;
        }

        System.out.println(a);


        //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen

        int b = 0;

        for (int j = 0; j < 1000; j = j + 2) {
            b = b + j;
        }

        System.out.print(b);
    }
}