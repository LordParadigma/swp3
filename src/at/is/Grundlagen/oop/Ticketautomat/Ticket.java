package at.is.Grundlagen.oop.Ticketautomat;

public class Ticket {
    private int iId;
    private double ausgabe;
    private double bezahlt;

    public Ticket(int iId, double ausgabe, double bezahlt) {
        this.iId = iId;
        this.ausgabe = ausgabe;
        this.bezahlt = bezahlt;
    }

    public int getiId() {
        return iId;
    }

    public double getAusgabe() {
        return ausgabe;
    }

    public double getBezahlt() {
        return bezahlt;
    }
}
