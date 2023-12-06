package at.is.Grundlagen.oop.Konto;

public class Test {
    public static void main(String[] args) {


        Basiskonto bk = new Basiskonto(500, "Ishan Shagireev", "AT28265050329520", 15359857, "Sparkasse", 2027, 123456789);
        bk.Auszahlung(600);
        bk.Einzahlung(8000);
        bk.Saldo();

        Sparbuch sk = new Sparbuch(98000, "Ishan Shagireev", "AT28568958451535", 123456789, "Sparkasse", 2027, 987654321, 4.5);
        sk.Auszahlung(90000);
        sk.Auszahlung(10000);
        sk.Einzahlung(2000);
        sk.Zinszahlung();
        sk.Saldo();

        Girokonto gk = new Girokonto(15000,"Ishan Shagireev", "AT28568958451535", 123456789, "Sparkasse", 2027, 987654321, 2000);
        gk.Auszahlung(16000);
        gk.Auszahlung(5000);
        gk.Einzahlung(8000);
        gk.Saldo();

        Kreditkonto kk = new Kreditkonto(2000,"Ishan Shagireev", "AT28568958451535", 123456789, "Sparkasse", 2027, 987654321, 8.2);
        kk.Auszahlung(2000);
        kk.Auszahlung(8000);
        kk.Einzahlung(8000);
        kk.Zinszahlung();
        kk.Saldo();
    }
}
