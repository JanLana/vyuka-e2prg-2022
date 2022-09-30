package cz.gyarab.prg2.s2;

public class Jablko {
    double vaha;
    String barva;

    public Jablko() {
        vaha = 0;
        barva = "neznama";
    }

    public Jablko(String b, double v) {
        vaha = v;
        barva = b;
    }

    @Override
    public String toString() {
        return "Jablko{" +
                "vaha=" + vaha +
                ", barva='" + barva + '\'' +
                '}';
    }
}
