package at.is.Grundlagen.oop.Ticketautomat;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    private Controller controller;
    private Drucker drucker;
    private Geldausgabe geldausgabe;
    private Ticketscanner ticketscanner;
   private List<Ticket> tickets;

   public void insertTicket(Ticket ticket){
   }

    public Ticket getTicket(double ausgabe, double bezahlt){
        return drucker.printTicket(tickets.size(), ausgabe, bezahlt);
    }



    public Automat(Controller controller, Drucker drucker, Geldausgabe geldausgabe, Ticketscanner ticketscanner) {
        this.controller = controller;
        this.drucker = drucker;
        this.geldausgabe = geldausgabe;
        this.ticketscanner = ticketscanner;
        this.tickets = new ArrayList<>();
    }

    public Controller getController() {
        return controller;
    }

    public Drucker getDrucker() {
        return drucker;
    }

    public Geldausgabe getGeldausgabe() {
        return geldausgabe;
    }

    public Ticketscanner getTicketscanner() {
        return ticketscanner;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
