package at.is.Grundlagen.oop.Konto;

public class Sparbuch extends Basiskonto{
    private double dZinssatz;


    public void Auszahlung(double dSumme){
        if(dSumme <= getdKontostand()) {
            System.out.println("Es wurde " + dSumme + "€ abgehoben");
            double dNeuerKontostand = getdKontostand() - dSumme;
            setdKontostand(dNeuerKontostand);
        } else {
            System.out.println("Saldo zu klein!");
        }
    }
    public void Zinszahlung(){
        double dZinsen = getdKontostand() / 100 * getdZinssatz();
        double dNeuerKontostand = getdKontostand() + dZinsen;
        setdKontostand(dNeuerKontostand);
        System.out.println("Sie bekommen " + dZinsen + "€ als Zinsen zugeschrieben");
    }
    public Sparbuch(double dKontostand, String sInhaber, String sIBAN, int iKartennummer, String sBank, int iGrültigBis, int iVerfügernummer, double dZinssatz) {
        super(dKontostand, sInhaber, sIBAN, iKartennummer, sBank, iGrültigBis, iVerfügernummer);
        this.dZinssatz = dZinssatz;
    }

    public double getdZinssatz() {
        return dZinssatz;
    }
}
