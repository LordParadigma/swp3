package at.is.Grundlagen.oop.Auto_Beispiel;

public class Flasche {
    private int iVolumen = 0;
    private String sHersteller = "kein hersteller";
    private String sGefülltmit = "nicht gefüllt";

    public Flasche(int iVolumen, String sHersteller, String sGefülltmit) {
        this.iVolumen = iVolumen;
        this.sHersteller = sHersteller;
        this.sGefülltmit = sGefülltmit;
    }

    public int getiVolumen() {
        return iVolumen;
    }

    public void setiVolumen(int iVolumen) {
        this.iVolumen = iVolumen;
    }

    public String getsHersteller() {
        return sHersteller;
    }

    public void setsHersteller(String sHersteller) {
        this.sHersteller = sHersteller;
    }

    public String getsGefülltmit() {
        return sGefülltmit;
    }

    public void setsGefülltmit(String sGefülltmit) {
        this.sGefülltmit = sGefülltmit;
    }
}
