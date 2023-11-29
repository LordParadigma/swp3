package at.is.Grundlagen.oop.Auto_Video_bsp;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private Engine motor;
    private Tank tank;
    private List<RearMirror> rückspiegel;
    private List<Tires> reifen;
    private float fBenzinVerbrauch;
    private float fBenzinMenge;
    private float fTankgröße;
    private String sMarke;
    private String sSeriennummer;
    private String sFarbe;

    public Car(){
    }

    public Car(String sMarke, String sSeriennummer, Engine motor, Tank tank) {
        this.sMarke = sMarke;
        this.sSeriennummer = sSeriennummer;
        this.motor = motor;
        this.tank = tank;
        this.rückspiegel = new ArrayList<>();
        this.reifen = new ArrayList<>();
    }

    public Car(float fBenzinVerbrauch, String sMarke, String sSeriennummer) {
        this.fBenzinVerbrauch = fBenzinVerbrauch;
        this.sMarke = sMarke;
        this.sSeriennummer = sSeriennummer;
    }

    public void addMirror(RearMirror rückspiegel){
        this.rückspiegel.add(rückspiegel);
    }

    public void addTires(Tires reifen){
        this.reifen.add(reifen);
    }

    public  void TÜF(){
        System.out.println("Marke: " + getsMarke() + "\nSeriennummer: " + getsSeriennummer() + "\nPferdestärken: " + getMotor().getiPS() + "\nLäuft mit: " + getMotor().getType() + "\nVerbrauch pro 100km: " + getMotor().getiVerbrauch() + "\nFüllmenge: " + getTank().getiFüllmenge() + "\nPosition des Tankdeckels: " + getTank().getPosition() + "\nGröße der Rückspiegel: " + getRückspiegel().get(0).getGröße() + "\n" + getReifen().get(0).getSaison() + " Reifen\n" + "Größe der Reifen: " + getReifen().get(0).getGröße() + "\nFür " + getReifen().get(0).getFürWetter() + "es Wetter");
    }

    public void drive(int leistung) {
        String speed;
        if (leistung < 1) {
            speed = "Motor läuft nicht! Bitte mit Leistung hoch gehen";
        }
        else if (leistung < 25) {
            speed = "Ich fahre langsam";
        } else if (leistung < 50){
            speed = "Ich fahre normal schnell";
        } else if (leistung < 75){
            speed = "Ich fahre schnell";
        } else if (leistung < 101){
            speed = "Ich fahre sehr schnell";
        } else {
            speed = "Motor überhitzt! Bitte mit leistung runter gehen";
        }
        System.out.println(speed);
    }

    public void drive() {
        int leistung = getMotor().getiBetriebsleitung();
        String speed;
        if (leistung < 1) {
            speed = "Motor läuft nicht! Bitte mit Leistung hoch gehen";
        }
        else if (leistung < 25) {
            speed = "Ich fahre langsam";
        } else if (leistung < 50){
            speed = "Ich fahre normal schnell";
        } else if (leistung < 75){
            speed = "Ich fahre schnell";
        } else if (leistung < 101){
            speed = "Ich fahre sehr schnell";
        } else {
            speed = "Motor überhitzt! Bitte mit leistung runter gehen";
        }
        System.out.println(speed);
    }

    public void bremse(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if (fBenzinMenge > fTankgröße / 10){
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int iAmountOfRepetitions){
        for (int i = 0; i < iAmountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        float fRange = this.fBenzinMenge / (this.fBenzinVerbrauch / 100);
        System.out.println(fRange);
    }


    public float getfBenzinVerbrauch() {
        return fBenzinVerbrauch;
    }

    public void setfBenzinVerbrauch(float fBenzinVerbrauch) {
        this.fBenzinVerbrauch = fBenzinVerbrauch;
    }

    public float getfBenzinMenge() {
        return fBenzinMenge;
    }

    public void setfBenzinMenge(float fBenzinMenge) {
        this.fBenzinMenge = fBenzinMenge;
    }

    public float getfTankgröße() {
        return fTankgröße;
    }

    public void setfTankgröße(float fTankgröße) {
        this.fTankgröße = fTankgröße;
    }

    public String getsMarke() {
        return sMarke;
    }

    public void setsMarke(String sMarke) {
        this.sMarke = sMarke;
    }

    public String getsSeriennummer() {
        return sSeriennummer;
    }

    public void setsSeriennummer(String sSeriennummer) {
        this.sSeriennummer = sSeriennummer;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public List<RearMirror> getRückspiegel() {
        return rückspiegel;
    }

    public List<Tires> getReifen() {
        return reifen;
    }
}