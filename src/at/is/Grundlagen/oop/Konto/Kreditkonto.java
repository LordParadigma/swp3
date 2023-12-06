package at.is.Grundlagen.oop.Konto;

public class Kreditkonto extends Basiskonto{
    private double dZinssatz;

    public void Einzahlung(double dSumme){
        if(dSumme <= (getdKontostand() * -1)) {
            System.out.println("Es wurde " + dSumme + "€ eingezahlt");
            double dNeuerKontostand = getdKontostand() + dSumme;
            setdKontostand(dNeuerKontostand);
        } else{
            System.out.println("Einzahlung zu hoch");
        }
    }

    public void Zinszahlung(){
        double dZinsen = getdKontostand() / 100 * getdZinssatz();
        double dNeuerKontostand = getdKontostand() - dZinsen;
        setdKontostand(dNeuerKontostand);
        System.out.println("Ihnen wurde " + dZinsen + "€ aufgrund von Zinsen abgezogen");
    }

    public Kreditkonto(double dKontostand, String sInhaber, String sIBAN, int iKartennummer, String sBank, int iGrültigBis, int iVerfügernummer, double dZinssatz) {
        super(dKontostand, sInhaber, sIBAN, iKartennummer, sBank, iGrültigBis, iVerfügernummer);
        this.dZinssatz = dZinssatz;
    }

    public double getdZinssatz() {
        return dZinssatz;
    }
}
