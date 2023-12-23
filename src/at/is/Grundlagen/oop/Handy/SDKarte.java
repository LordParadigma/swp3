package at.is.Grundlagen.oop.Handy;

import java.util.ArrayList;
import java.util.List;

public class SDKarte {
    private int capacity;
    private List<HandyDatei> dateien;

    public void getAllFiles() {
        for (int i = 0; i < dateien.size(); i++) {
            dateien.get(i).getInfo();
        }
    }

    public void saveFile(HandyDatei dateien){
        if (getFreeSpace() < dateien.getSize()){
            System.out.println("Zu wenig Speicherplatz");
        }
        else{
            this.dateien.add(dateien);
        }
    }

    public int getFreeSpace(){
        int freierSpeicher = getCapacity();
        for (int i = 0; i < dateien.size(); i++) {
            freierSpeicher = freierSpeicher - dateien.get(i).getSize();
        }
        return freierSpeicher;
    }

    public SDKarte(int capacity) {
        this.capacity = capacity;
        this.dateien = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }
    public List<HandyDatei> getDateien() {
        return dateien;
    }
}