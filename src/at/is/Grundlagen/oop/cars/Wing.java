package at.is.Grundlagen.oop.cars;

public class Wing {
    private String seriennummer;
    private String material;
    private int downforce;

    public Wing(String seriennummer, String material, int downforce) {
        this.seriennummer = seriennummer;
        this.material = material;
        this.downforce = downforce;
    }

    public String getSeriennummer() {
        return seriennummer;
    }

    public String getMaterial() {
        return material;
    }

    public int getDownforce() {
        return downforce;
    }
}
