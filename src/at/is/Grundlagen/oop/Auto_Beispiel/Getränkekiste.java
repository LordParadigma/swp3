package at.is.Grundlagen.oop.Auto_Beispiel;

public class Getränkekiste {
    private int iAnzahlgetränke = 0;
    private Flasche flasche;

    public Getränkekiste(int iAnzahlgetränke, Flasche flasche) {
        this.iAnzahlgetränke = iAnzahlgetränke;
        this.flasche = flasche;
    }

    public int getiAnzahlgetränke() {
        return iAnzahlgetränke;
    }

    public void setiAnzahlgetränke(int iAnzahlgetränke) {
        this.iAnzahlgetränke = iAnzahlgetränke;
    }

    public Flasche getFlasche() {
        return flasche;
    }

    public void setFlasche(Flasche flasche) {
        this.flasche = flasche;
    }
}
