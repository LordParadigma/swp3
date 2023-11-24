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
        isOn = true;
        int neuerAkku1 = getBatterien().get(0).getChargingStatus();
        int neuerAkku2 = getBatterien().get(1).getChargingStatus();

        neuerAkku1 -= 5;
        neuerAkku2 -= 5;
        getBatterien().get(0).setChargingStatus(neuerAkku1);
        getBatterien().get(1).setChargingStatus(neuerAkku2);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public void getStatus(){
        int Akku1 = getBatterien().get(0).getChargingStatus();
        int Akku2 = getBatterien().get(1).getChargingStatus();
        int Mittelwert = (Akku1 + Akku2) / 2;

        System.out.println("Die erste Batterie hat " + getBatterien().get(0).getChargingStatus() + "% Akku\nDoe zweite Batterie hat " + getBatterien().get(1).getChargingStatus() + "% Akku\nDer Mittelwert der Akkus beträgt " + Mittelwert + "%");
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
