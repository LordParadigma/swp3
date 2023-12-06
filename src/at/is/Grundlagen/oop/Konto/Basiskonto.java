package at.is.Grundlagen.oop.Konto;

public class Basiskonto {
    private double dKontostand;
    private String sInhaber;
    private String sIBAN;
    private int iKartennummer;
    private String sBank;
    private int iGrültigBis;
    private int iVerfügernummer;

    public void Auszahlung(double dSumme){
        System.out.println("Es wurde " + dSumme + "€ abgehoben");
        double dNeuerKontostand = getdKontostand() - dSumme;
        setdKontostand(dNeuerKontostand);
    }

    public void Einzahlung(double dSumme){
        System.out.println("Es wurde " + dSumme + "€ eingezahlt");
        double dNeuerKontostand = getdKontostand() + dSumme;
        setdKontostand(dNeuerKontostand);
    }

    public void Saldo(){
        System.out.println("Der Kontostand beträgt " + getdKontostand() + "€");
    }

    public Basiskonto(double dKontostand, String sInhaber, String sIBAN, int iKartennummer, String sBank, int iGrültigBis, int iVerfügernummer) {
        this.dKontostand = dKontostand;
        this.sInhaber = sInhaber;
        this.sIBAN = sIBAN;
        this.iKartennummer = iKartennummer;
        this.sBank = sBank;
        this.iGrültigBis = iGrültigBis;
        this.iVerfügernummer = iVerfügernummer;
    }

    public void setdKontostand(double dKontostand) {
        this.dKontostand = dKontostand;
    }

    public double getdKontostand() {
        return dKontostand;
    }

    public String getsInhaber() {
        return sInhaber;
    }

    public String getsIBAN() {
        return sIBAN;
    }

    public int getiKartennummer() {
        return iKartennummer;
    }

    public String getsBank() {
        return sBank;
    }

    public int getiGrültigBis() {
        return iGrültigBis;
    }

    public int getiVerfügernummer() {
        return iVerfügernummer;
    }
}
