package at.is.Grundlagen.oop.Musicbox;

public class Test {
    public static void main(String[] args) {


        Titel t1 = new Titel(2.43, "Skyfall");
        Titel t2 = new Titel(2.54, "Rumbling");
        Titel t3 = new Titel(2.26, "Für Elise");
        Titel t4 = new Titel(3.13, "Capo");

        Schallplatten s1 = new Schallplatten(1, "Mix 1");
        s1.addTitel(t1);
        s1.addTitel(t2);
        s1.addTitel(t3);
        s1.addTitel(t4);
        Box box = new Box(120, "Arcade123", "Brauch", 1986);
        box.addRecord(s1);

        /*for (int i = 0; i < 55; i++) {
            int nummer = i;
            Schallplatten jaja = new Schallplatten(nummer, "Mix" + nummer);
            box.addRecord(jaja);
        }*/

        System.out.println("Die Summer aller Titel beträgt " + box.getSumOfMusic() + " Minuten.");

        box.searchRecord("Skyfall");
        box.play(1.32);
        box.loadRecord(t2);
        box.play(1.32);
    }
}