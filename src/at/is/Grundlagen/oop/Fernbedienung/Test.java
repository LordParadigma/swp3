package at.is.Grundlagen.oop.Fernbedienung;

public class Test {
    public static void main(String[] args) {

        Battery b1 = new Battery(80);
        Battery b2 = new Battery(95);

        Remote fernbedienung = new Remote("Samsung");
        fernbedienung.addBattery(b1);
        fernbedienung.addBattery(b2);

        fernbedienung.getStatus();
        fernbedienung.turnOn();
        fernbedienung.getStatus();
        fernbedienung.turnOff();
    }
}
