package at.is.Grundlagen.oop.geometrischeFiguren;

public class Figur {
    private String sName;

    public Figur(String sName) {
        this.sName = sName;
    }

    public void Flächeninhalt(){
        double dFächeninhalt = 0;
        System.out.println("Der Flächeninhalt beträgt: " + dFächeninhalt + " LE^2");
    }

    public void NameAusgabe(){
        System.out.println("Der Name der Figur lautet " + getsName());
    }

    public String getsName() {
        return sName;
    }
}
