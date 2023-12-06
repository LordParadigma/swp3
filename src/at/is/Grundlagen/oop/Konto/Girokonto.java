package at.is.Grundlagen.oop.Konto;

public class Girokonto extends Basiskonto{
    private double dÜberziehungsrahmen;

    public void Auszahlung(double dSumme){
        if((getdÜberziehungsrahmen() + getdKontostand()) >= dSumme) {
            System.out.println("Es wurde " + dSumme + "€ abgehoben");
            double dNeuerKontostand = getdKontostand() - dSumme;
            setdKontostand(dNeuerKontostand);
        } else {
            System.out.println("Limit überschritten!");
        }
    }
    public Girokonto(double dKontostand, String sInhaber, String sIBAN, int iKartennummer, String sBank, int iGrültigBis, int iVerfügernummer, double dÜberziehungsrahmen) {
        super(dKontostand, sInhaber, sIBAN, iKartennummer, sBank, iGrültigBis, iVerfügernummer);
        this.dÜberziehungsrahmen = dÜberziehungsrahmen;
    }

    public double getdÜberziehungsrahmen() {
        return dÜberziehungsrahmen;
    }
}