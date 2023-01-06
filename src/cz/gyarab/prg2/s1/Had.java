package cz.gyarab.prg2.s1;

import java.io.Serializable;

public class Had extends Zvire {
    int delka;

    public Had(int delka) {
        super("HAD");
        this.delka = delka;
    }

    @Override
    public String toString() {
        return "Had{" +
                "delka=" + delka +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
