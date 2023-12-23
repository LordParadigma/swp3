package at.is.Grundlagen.oop.Kamera;

public class Test {
    public static void main(String[] args) {
        SDCard sdCard = new SDCard(15);
        LensBrennweite lensBrennweite = new LensBrennweite();
        LensProducer lensProducer = new LensProducer("Bibibaba", "Austria");
        Lens lens = new Lens(lensProducer, lensBrennweite);
        Producer producer = new Producer("chippichippa", "chappachappa");

        Camera camera = new Camera(10,"Weiß",producer,lens,sdCard);
        camera.takePicture(Camera.type.klein,"Baum","23.12.2023");
        camera.takePicture(Camera.type.groß,"dubbidubbi", "23.43.56");
        camera.takePicture(Camera.type.groß,"dabbadabbda", "54.345.5");
        camera.takePicture(Camera.type.groß,"piipkfds", "7654.456.64");
        camera.printAllFiles();
        camera.getFreeSpace();
    }
}
