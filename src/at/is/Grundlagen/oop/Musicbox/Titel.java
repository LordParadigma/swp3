package at.is.Grundlagen.oop.Musicbox;

public class Titel {
    private double dLänge;
    private String sName;

    public Titel(double dLänge, String sName) {
        this.dLänge = dLänge;
        this.sName = sName;
    }

    public double getdLänge() {
        return dLänge;
    }

    public String getsName() {
        return sName;
    }
}
