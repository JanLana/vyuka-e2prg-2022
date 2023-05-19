package cz.gyarab.prg2.s2;

public class Prvek {
    int hodnota;
    Prvek dalsi;

    public Prvek(int hodnota, Prvek dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
    }
}
