package cz.gyarab.prg2.s1;

import java.io.Serializable;

public class Kocka extends Zvire {
    int pocetZivotu;

    public Kocka(String jmeno, int pocetZivotu) {
        super(jmeno);
        this.pocetZivotu = pocetZivotu;
    }

    @Override
    public String toString() {
        return "Kocka{" +
                "pocetZivotu=" + pocetZivotu +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
