package INFI;
import java.awt.*;
import java.util.Random;


public class automatischeDatensätze {
    public static void main(String[] args) {
        Random random = new Random();
        int iKundenID = 0;
        int iBestellmenge = 0;
        int iNummer = 0;
        float fEinzelPreis = 0;
        float fGesamtPreis = 0;
        int iMonat = 0;
        int iTag = 0;
        int iJahr = 2023;

        for (int i = 1; i <= 50; i++) {
            iKundenID = i;
            iBestellmenge = random.nextInt(200);
            iNummer = random.nextInt(100000, 1000000);
            fEinzelPreis = random.nextFloat(1, 120);
            fGesamtPreis = fEinzelPreis * iBestellmenge;
            iMonat = random.nextInt(1,12);
            if (iMonat == 2){
                iTag = random.nextInt(1, 28);
            } else {
                iTag = random.nextInt(1, 30);
            }


            System.out.println("Kunden ID: " + iKundenID + " Bestellmenge: " + iBestellmenge + " Stück   Preis pro Stück: " +
                    fEinzelPreis + "€   Gesamtpreis: " + fGesamtPreis + "€   +43 676 " + iNummer +
                    "   Datum: " + iTag + "." + iMonat + "." + iJahr);
        }
    }
}
