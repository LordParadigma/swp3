package at.is.Grundlagen.oop.Auto_Beispiel;

public class Fahrrad {

    private String sFarbe = "keine Farbe";
    private int iReifendurchmesser = 0;
    private int iHöhe = 0;

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public int getiReifendurchmesser() {
        return iReifendurchmesser;
    }

    public void setiReifendurchmesser(int iReifendurchmesser) {
        this.iReifendurchmesser = iReifendurchmesser;
    }

    public int getiHöhe() {
        return iHöhe;
    }

    public void setiHöhe(int iHöhe) {
        this.iHöhe = iHöhe;
    }
}
