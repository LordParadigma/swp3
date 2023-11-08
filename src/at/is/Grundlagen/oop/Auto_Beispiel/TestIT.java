package at.is.Grundlagen.oop.Auto_Beispiel;

public class TestIT {
    public static void main(String[] args) {

        Flasche flasche = new Flasche(500, "cola", "cola zero");
        Getränkekiste getränkekiste = new Getränkekiste(24,flasche);


        Auto auto = new Auto(300, "rot");
        Auto auto1 = new Auto();

        auto1.setiLeistung(500);
        auto1.setsFarbe("grün");

        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());
        System.out.println(auto1.getiLeistung());
        System.out.println(auto1.getsFarbe());

        Fahrrad fahrrad = new Fahrrad();
        fahrrad.setsFarbe("blau");
        fahrrad.setiHöhe(80);
        fahrrad.setiReifendurchmesser(20);

        System.out.println(fahrrad.getsFarbe());
        System.out.println(fahrrad.getiHöhe());
        System.out.println(fahrrad.getiReifendurchmesser());

        auto.setKofferraumfahrrad(fahrrad);
        auto.setKofferraumgetränk(getränkekiste);

        System.out.println("Im auto sind " + getränkekiste.getiAnzahlgetränke() + " Flaschen gefüllt mit " + flasche.getsGefülltmit());


    }
}
