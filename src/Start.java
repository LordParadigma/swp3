public class Start {
    public static void main(String[] args) { //Muss am Anfang gemacht werden um das Programm zu beginnen

        //Variablen deklarieren
        byte b_zahl;            //-128 to 127
        short s_zahl;           //-32,768 to 32,767
        int i_zahl;             //-2,147,483,648 to 2,147,483,647
        char c_buchstabe;       //single character
        float f_zahl;           //6 to 7 decimal digits
        double d_zahl;          //15 decimal digits
        String sHallo;
        Boolean B_falsch;       //true or false values
        int[] i_array;
        long l_zahl;            //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        //Variablen initialisieren
        b_zahl = 1;
        s_zahl = 2;
        i_zahl = 3;
        l_zahl = 4;
        f_zahl = 5;
        d_zahl = 6.6;
        c_buchstabe = 'a';
        sHallo = "Hallo";
        B_falsch = false;
        i_array = new int[4]; //array erstellen und größe angeben
        i_array[0] = 3; //array füllen

        int a = 100;
        long b = 10000;
        char c = 'a';
        float d = 10;

        System.out.println(sHallo); //cout mit Zeilenumbruch
        System.out.print("Ishan Shagi\nreev");//cout ohne Zeilenumbruch
        System.out.println(12);
        System.out.println("Ishan Shagireev");
        System.out.print(i_zahl); //cout einer Variablen

        addPoint("\nIch liebe Femboys");

    }

    public static void addPoint(String s) {

        System.out.println(s + ".");
    }
}
