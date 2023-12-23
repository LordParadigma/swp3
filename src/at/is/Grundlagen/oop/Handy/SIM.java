package at.is.Grundlagen.oop.Handy;

public class SIM {
    private int id;
    private String number;

    public void doCall(String number1){
        System.out.println(number + " ruft " + number1 + " an!");
    }

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
