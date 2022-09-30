package cz.gyarab.prg2.s2;

import java.util.Arrays;

public class KosikNaJablka {
    int velikost;
    Jablko[] seznam;

    int kolikJeJablekVKosiku;

    public KosikNaJablka(int velikost) {
        this.velikost = velikost;
        seznam = new Jablko[velikost];
        kolikJeJablekVKosiku = 0;
    }

    public void pridejJablko(Jablko j) {
        seznam[kolikJeJablekVKosiku] = j;
        kolikJeJablekVKosiku += 1;
    }

    @Override
    public String toString() {
        return "KosikNaJablka{" +
                "velikost=" + velikost +
                ", seznam=" + Arrays.toString(seznam) +
                ", kolikJeJablekVKosiku=" + kolikJeJablekVKosiku +
                '}';
    }
}
