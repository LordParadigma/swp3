package at.is.Grundlagen.oop.Ticketautomat;

public class Drucker {

    public Ticket printTicket(int Id, double ausgabe, double bezahlt){
        Ticket ticket = new Ticket(Id, ausgabe, bezahlt);
        return ticket;
    }
}
