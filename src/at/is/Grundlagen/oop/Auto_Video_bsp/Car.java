package at.is.Grundlagen.oop.Auto_Video_bsp;

public class Car {

    private Engine motor;
    private Tank tank;
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
    }

    public Car(float fBenzinVerbrauch, String sMarke, String sSeriennummer) {
        this.fBenzinVerbrauch = fBenzinVerbrauch;
        this.sMarke = sMarke;
        this.sSeriennummer = sSeriennummer;
    }

    public  void TÜF(){
        System.out.println("Marke: " + getsMarke() + "\nSeriennummer: " + getsSeriennummer() + "\nPferdestärken: " + getMotor().getiPS() + "\nLäuft mit: " + getMotor().getType() + "\nVerbrauch pro 100km: " + getMotor().getiVerbrauch() + "\nFüllmenge: " + getTank().getiFüllmenge() + "\nPosition des Tankdeckels: " + getTank().getPosition());
    }

    public void drive(int speed) {
        this.fBenzinMenge = this.fBenzinMenge - this.fBenzinVerbrauch;
        System.out.println("Ich fahre mit " + speed + "km/h");
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
}