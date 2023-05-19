package cz.gyarab.prg2.s1;

public class Prvek {
    int polozka;
    Prvek dalsi;

    public Prvek(int polozka, Prvek dalsi) {
        this.polozka = polozka;
        this.dalsi = dalsi;
    }
}
