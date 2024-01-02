package at.is.Grundlagen.oop.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private int iGewicht;
    private String sHersteller;
    private String sFarbe;
    private int iHerstellungsjahr;
    private List<Schallplatten> schallplatte;
    private Titel ausgewählterTitel;


    public void addRecord(Schallplatten schallplatten){
        if(schallplatte.size() <= 50){
            this.schallplatte.add(schallplatten);
            System.out.println("Die Schallplatte " + schallplatten.getsName() + " wurde eingelegt;");
        }
        else {
            System.out.println("Die maximale Anzahl an Schallplatten wurde bereits erreicht!");
        }
    }
    public void removeRecord(Schallplatten schallplatten){
        this.schallplatte.remove(schallplatten);
        System.out.println("Die Schallplatte " + schallplatten.getsName() + " wurde ausgeworfen");
    }

    public double getSumOfMusic(){
        double dSumme = 0;
        for (int i = 0; i < schallplatte.size(); i++) {
            for (int j = 0; j < schallplatte.get(i).getTitel().size(); j++) {
                dSumme = dSumme + schallplatte.get(i).getTitel().get(j).getdLänge();
            }
        }
        return dSumme;
    }

    public void searchRecord(String titel){
        boolean gefunden = false;
        for (int i = 0; i < schallplatte.size(); i++) {
            for (int j = 0; j < schallplatte.get(i).getTitel().size(); j++) {
                if (schallplatte.get(i).getTitel().get(j).getsName() == titel){
                    System.out.println("Der Titel befindet sich auf der Schallplatte " + schallplatte.get(i).getsName() + " mit der ID " + schallplatte.get(i).getiId());
                    gefunden = true;
                }
            }
        }
        if(gefunden == false){
            System.out.println("Der Titel konnte nicht gefunden werden!");
        }
    }

    public void loadRecord(Titel titel){
        this.ausgewählterTitel = titel;
        System.out.println("Der Titel " + titel.getsName() + " wurde ausgewählt");
    }

    public void play(double num){
        if (ausgewählterTitel == null){
            System.out.println("Achtung! Es wurde kein Titel ausgewählt!");
        } else {
            System.out.printf("Der Titel " + ausgewählterTitel.getsName() + " wird von Minute " + num + " abgespielt");
        }
    }

    public Box(int iGewicht, String sHersteller, String sFarbe, int iHerstellungsjahr) {
        this.iGewicht = iGewicht;
        this.sHersteller = sHersteller;
        this.sFarbe = sFarbe;
        this.iHerstellungsjahr = iHerstellungsjahr;
        this.schallplatte = new ArrayList<>();
    }

    public int getiGewicht() {
        return iGewicht;
    }

    public String getsHersteller() {
        return sHersteller;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public int getiHerstellungsjahr() {
        return iHerstellungsjahr;
    }

    public List<Schallplatten> getSchallplatte() {
        return schallplatte;
    }

    public Titel getAusgewählterTitel() {
        return ausgewählterTitel;
    }
}