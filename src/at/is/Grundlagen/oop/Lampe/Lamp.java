package at.is.Grundlagen.oop.Lampe;

import at.is.Grundlagen.oop.Auto_Video_bsp.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Elements> elemente;

    public Lamp() {
        this.elemente = new ArrayList<>();
    }

    public void addLightElement(Elements elemente){
        this.elemente.add(elemente);
    }

    public void turnAllOn(){
        for (int i = 0; i < elemente.size(); i++) {
            if (elemente.get(i).isStatusOn() == false) {
                elemente.get(i).setStatusOn(true);
                int erhöhung = elemente.get(i).getStromverbrauch() + 5;
                elemente.get(i).setStromverbrauch(erhöhung);
            }
        }
    }

    public double getOverallPowerUsage(){
        double gesamtStromverbrauch = 0;
        for (int i = 0; i < elemente.size(); i++) {
            gesamtStromverbrauch += elemente.get(i).getStromverbrauch();
        }
        System.out.println("Der bisher verbrauchte Strom beträgt " + gesamtStromverbrauch);
        return gesamtStromverbrauch;
    }

    public void printNamesOfLightElements(){
        System.out.println("Es gibt folgende LEDS: ");
        for (int i = 0; i < elemente.size(); i++) {
            System.out.println("    " + elemente.get(i).getName());
        }
    }
}