package at.is.Grundlagen.oop.Fernbedienung;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private String marke;
    private boolean isOn;
    private int hasPower;
    private List<Battery> batterien;

    public Remote(String marke) {
        this.marke = marke;
        this.batterien = new ArrayList<>();
    }

    public void turnOn(){
        if (isOn == false) {
            isOn = true;
            for (int i = 0; i < batterien.size(); i++) {
                int neuerAkku = batterien.get(i).getChargingStatus() - 5;
                batterien.get(i).setChargingStatus(neuerAkku);
            }
            System.out.println("Verbraucher angeschlossen");
        } else {
            System.out.println("Bereits eingeschaltet");
        }
    }

    public void turnOff(){
        if (isOn == true) {
            isOn = false;
            System.out.println("Kein Verbraucher angeschlossen");
        } else {
            System.out.println("Bereits ausgeschaltet");
        }
    }

    public void getStatus(){
        int Summe = 0;
        for (int i = 0; i < batterien.size(); i++) {
            Summe += batterien.get(i).getChargingStatus();
        }
        setHasPower(Summe / batterien.size());
        System.out.println("Die erste Batterie hat " + getBatterien().get(0).getChargingStatus() + "% Akku\nDie zweite Batterie hat " + getBatterien().get(1).getChargingStatus() + "% Akku\nDer Mittelwert der Akkus beträgt " + hasPower + "%");
    }

    public void addBattery(Battery batterien){
        this.batterien.add(batterien);
    }


    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getHasPower() {
        return hasPower;
    }

    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public List<Battery> getBatterien() {
        return batterien;
    }

    public void setBatterien(List<Battery> batterien) {
        this.batterien = batterien;
    }
}
