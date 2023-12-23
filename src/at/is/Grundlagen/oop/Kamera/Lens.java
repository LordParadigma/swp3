package at.is.Grundlagen.oop.Kamera;

public class Lens {
    private LensProducer herstllerO;
    private LensBrennweite brennweite;

    public Lens(LensProducer herstllerO, LensBrennweite brennweite) {
        this.herstllerO = herstllerO;
        this.brennweite = brennweite;
    }

    public LensProducer getHerstllerO() {
        return herstllerO;
    }

    public LensBrennweite getBrennweite() {
        return brennweite;
    }
}
