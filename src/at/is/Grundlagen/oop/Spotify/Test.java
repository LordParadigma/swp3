package at.is.Grundlagen.oop.Spotify;

public class Test {
    public static void main(String[] args) {

        Werbung werbung1 = new Werbung(1, "Gebrüder Weiß", 0.25);
        Werbung werbung2 = new Werbung(2, "Spotify", 0.31);
        Werbung werbung3 = new Werbung(3, "SoundCloud", 0.14);
        Werbung werbung4 = new Werbung(4, "HagenPiPaPo", 1.42);
        Werbung werbung5 = new Werbung(5, "random Werbung", 14.59);


        Musik lied1 = new Musik(1, "Adele", 4.46, "SkyFall", "Pop");
        Musik lied2 = new Musik(2, "Kinneret", 2.45, "No Wind Resistance", "Pop");
        Musik lied3 = new Musik(3, "Memphis", 2.48, "9mm", "Rap");
        Musik lied4 = new Musik(4, "Wonder Band", 4.09, "Nightcall", "sad");
        Musik lied5 = new Musik(5, "I Monster", 3.33, "Who Is She?", "sad");
        Musik lied6 = new Musik(6, "Drachenlord", 2.06, "Skrrr Skrrr", "rap");
        Musik lied7 = new Musik(7, "Kali Uchis", 3.07, "Moonlight", "vibe");
        Musik lied8 = new Musik(8, "Kendrick Lamar", 6.26, "Money Trees", "rap");
        Musik lied9 = new Musik(9, "Freddie Dredd", 2.54, "All Alone", "Phonk");
        Musik lied10 = new Musik(10, "Oneheart", 1.50, "snowfall", "sad slow beat");
        Musik lied11 = new Musik(11, "FIFTY FIFTY", 2.25, "Cupid", "romance");
        Musik lied12 = new Musik(12, "Mareux", 3.14, "The Perfect Girl", "slow beat");
        Musik lied13 = new Musik(13, "XXXTENTACION", 2.15, "Moonlight", "rap");
        Musik lied14 = new Musik(14, "Sig", 2.45, "Oompa Loompa", "rap");
        Musik lied15 = new Musik(15, "1nonly", 2.34, "Mine", "rap");

        Website website = new Website();
        website.addWerbung(werbung1);
        website.addWerbung(werbung2);
        website.addWerbung(werbung3);
        website.addWerbung(werbung4);
        website.addWerbung(werbung5);
        website.addMusik(lied1);
        website.addMusik(lied2);
        website.addMusik(lied3);
        website.addMusik(lied4);
        website.addMusik(lied5);
        website.addMusik(lied6);
        website.addMusik(lied7);
        website.addMusik(lied8);
        website.addMusik(lied9);
        website.addMusik(lied10);
        website.addMusik(lied11);
        website.addMusik(lied12);
        website.addMusik(lied13);
        website.addMusik(lied14);
        website.addMusik(lied15);

        gui gui = new gui(website);

        gui.run();



    }
}
