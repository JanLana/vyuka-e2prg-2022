package cz.gyarab.prg2.s2;

import java.io.Serializable;

public class Jahoda extends Ovoce {
    int pocetJadyrek;

    public Jahoda(String jmeno, int pocetJadyrek) {
        super(jmeno);
        this.pocetJadyrek = pocetJadyrek;
    }

    @Override
    public String toString() {
        return "Jahoda{" +
                "pocetJadyrek=" + pocetJadyrek +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
