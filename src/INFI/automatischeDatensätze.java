package INFI;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import com.github.javafaker.Faker;


public class automatischeDatensätze {
    public static void main(String[] args) {
        Random random = new Random();
        Faker faker = new Faker(new Locale("DE-AT"));
        Faker faker1 = new Faker(new Locale("EN"));

        int iID = 0;
        int iBestellmenge = 0;
        int iNummer = 0;
        String sEinzelPreis = " ";
        int iGesamtPreis = 0;
        int iMonat = 0;
        int iTag = 0;
        int iJahr = 0;
        int iBegrenzer = 100;

        System.out.println("Hier sind " + iBegrenzer + " Datensätze:");


        try {
            FileWriter myWriter = new FileWriter("insertData-Lagerbestand.txt");
            for (int i = 1; i <= iBegrenzer; i++) {
                iID = i;
                int iLagerbestand = random.nextInt(200);
                String sOrt = faker.address().city();

                iMonat = random.nextInt(1, 13);
                iJahr = random.nextInt(2020, 2024);
                if (iMonat == 2) {
                    iTag = random.nextInt(1, 29);
                } else if (iMonat == 1 || iMonat == 3 || iMonat == 5 || iMonat == 7 || iMonat == 8 || iMonat == 10 || iMonat == 12) {
                    iTag = random.nextInt(1, 32);
                } else {
                    iTag = random.nextInt(1, 31);
                }
                String record = "(" + i + ", " + iLagerbestand + ", '" + sOrt + "', '" + iJahr + "-" + iMonat + "-" + iTag + "'),";
                System.out.println(record);

                myWriter.write(record + "\n");
            }
            myWriter.close();
            System.out.println("Erfolgreich Daten geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler!");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("insertData-Kunden.txt");
            for (int i = 1; i <= iBegrenzer; i++) {
                iID = i;
                String sVorname = faker.name().firstName();
                String sNachname = faker.name().lastName();
                String sAdresse = faker.address().streetAddress();
                String sEmail = sVorname + "." + sNachname + "@gmail.com";
                iNummer = random.nextInt(100000, 1000000);
                String record = "(" + i + ", '" + sVorname + "', '" + sNachname + "', '" + sAdresse + "', '" + sEmail + "', '0676" + iNummer + "'),";
                System.out.println(record);

                myWriter.write(record + "\n");
            }
            myWriter.close();
            System.out.println("Erfolgreich Daten geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler!");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("insertData-Produkte.txt");
            for (int i = 1; i <= iBegrenzer; i++) {
                iID = i;
                String sProduktname = faker.commerce().productName();
                sEinzelPreis = faker1.commerce().price();
                String sProduktlinie = faker.commerce().department();
                String record = "(" + i + ", '" + sProduktname + "', " +  sEinzelPreis + ", '" + sProduktlinie + "'),";
                System.out.println(record);

                myWriter.write(record + "\n");
            }
            myWriter.close();
            System.out.println("Erfolgreich Daten geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler!");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("insertData-Bestellungen.txt");
            for (int i = 1; i <= iBegrenzer; i++) {
                iID = i;
                iBestellmenge = random.nextInt(200);

                iMonat = random.nextInt(1, 13);
                iJahr = random.nextInt(2020, 2024);
                if (iMonat == 2) {
                    iTag = random.nextInt(1, 29);
                } else if (iMonat == 1 || iMonat == 3 || iMonat == 5 || iMonat == 7 || iMonat == 8 || iMonat == 10 || iMonat == 12) {
                    iTag = random.nextInt(1, 32);
                } else {
                    iTag = random.nextInt(1, 31);
                }
                String record = "(" + i + ", " + i + ", " + i + ", " + iBestellmenge + ", '" + iJahr + "-" + iMonat + "-" + iTag + "'),";
                System.out.println(record);

                myWriter.write(record + "\n");
            }
            myWriter.close();
            System.out.println("Erfolgreich Daten geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler!");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("insertData-Mitarbeiter.txt");
            for (int i = 1; i <= iBegrenzer; i++) {
                iID = i;
                String sVorname = faker.name().firstName();
                String sNachname = faker.name().lastName();
                String sPosition = faker.company().profession();
                String sEmail = sVorname + "." + sNachname + "@gmail.com";
                iNummer = random.nextInt(100000, 1000000);
                int iGehalt = random.nextInt(1800, 5000);

                String record = "(" + i + ", '" + sVorname + "', '" + sNachname + "', '" + sPosition + "', '" + sEmail + "', '0676" + iNummer + "', " + iGehalt + "),";
                System.out.println(record);

                myWriter.write(record + "\n");
            }
            myWriter.close();
            System.out.println("Erfolgreich Daten geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler!");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("insertData-Lagerbestand.txt");
            for (int i = 1; i <= iBegrenzer; i++) {
                iID = i;
                int iLagerbestand = random.nextInt(200);
                String sOrt = faker.address().city();

                iMonat = random.nextInt(1, 13);
                iJahr = random.nextInt(2020, 2024);
                if (iMonat == 2) {
                    iTag = random.nextInt(1, 29);
                } else if (iMonat == 1 || iMonat == 3 || iMonat == 5 || iMonat == 7 || iMonat == 8 || iMonat == 10 || iMonat == 12) {
                    iTag = random.nextInt(1, 32);
                } else {
                    iTag = random.nextInt(1, 31);
                }
                String record = "(" + i + ", " + iLagerbestand + ", '" + sOrt + "', '" + iJahr + "-" + iMonat + "-" + iTag + "'),";
                System.out.println(record);

                myWriter.write(record + "\n");
            }
            myWriter.close();
            System.out.println("Erfolgreich Daten geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler!");
            e.printStackTrace();
        }
    }
}
