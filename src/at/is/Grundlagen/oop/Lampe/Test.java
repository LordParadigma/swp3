package at.is.Grundlagen.oop.Lampe;

public class Test {
    public static void main(String[] args) {
        Elements e1 = new Elements("LED1", "Blau", 10, true);
        Elements e2 = new Elements("LED2", "Grün", 8, false);
        Elements e3 = new Elements("LED3", "Rot", 2, false);
        Elements e4 = new Elements("LED4", "Pink", 13, true);

        Lamp l1 = new Lamp();
        l1.addLightElement(e1);
        l1.addLightElement(e2);
        l1.addLightElement(e3);
        l1.addLightElement(e4);

        l1.getOverallPowerUsage();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        e1.turnOn();
    }
}