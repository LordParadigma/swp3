package at.is.Grundlagen.oop.Handy;

public class HandyDatei {
    private String extension;
    private int size;
    private String name;

    public void getInfo(){
        System.out.println("Datei: " + name + "." + extension + " | Größe: " + size);
    }

    public HandyDatei(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }
    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }

}
