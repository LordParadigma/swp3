package at.is.Grundlagen.oop.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Schallplatten {
    private int iId;
    private String sName;
    private List<Titel> titel;

    public void addTitel(Titel titel){
        this.titel.add(titel);
        System.out.println(titel.getsName() + " wurde der Schallplatte " + sName + " hinzugefügt.");
    }

    public Schallplatten(int iId, String sName) {
        this.iId = iId;
        this.sName = sName;
        this.titel = new ArrayList<>();
    }

    public int getiId() {
        return iId;
    }

    public String getsName() {
        return sName;
    }

    public List<Titel> getTitel() {
        return titel;
    }
}
