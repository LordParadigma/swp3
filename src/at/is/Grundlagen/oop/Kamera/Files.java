package at.is.Grundlagen.oop.Kamera;

public class Files {
    private String name;
    private String datum;
    private int größe;

    public Files(String name, String datum, int größe) {
        this.name = name;
        this.datum = datum;
        this.größe = größe;
    }

    public void getInfo(){
        System.out.println("Datei: " + name + " | " + datum + " | Größe: " + größe + "GB");
    }

    public String getName() {
        return name;
    }

    public String getDatum() {
        return datum;
    }

    public int getGröße() {
        return größe;
    }
}
