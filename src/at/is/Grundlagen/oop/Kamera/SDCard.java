package at.is.Grundlagen.oop.Kamera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int kapazität;
    private List<Files> dateien;

    public int getFreeSpace(){
        int freierSpeicher = getKapazität();
        for (int i = 0; i < dateien.size(); i++) {
            freierSpeicher = freierSpeicher - dateien.get(i).getGröße();
        }
        return freierSpeicher;
    }

    public void getAllFiles() {
        for (int i = 0; i < dateien.size(); i++) {
            dateien.get(i).getInfo();
        }
    }

    public void savePicture(Files datei){
        this.dateien.add(datei);
    }
    public SDCard(int kapazität) {
        this.kapazität = kapazität;
        this.dateien = new ArrayList<>();
    }

    public int getKapazität() {
        return kapazität;
    }

    public List<Files> getDateien() {
        return dateien;
    }
}
