package cz.gyarab.prg2.s2;

import java.io.Serializable;

public class Banan extends Ovoce {
    double zakroucenost;

    public Banan(String jmeno, double zakroucenost) {
        super(jmeno);
        this.zakroucenost = zakroucenost;
    }

    @Override
    public String toString() {
        return "Banan{" +
                "zakroucenost=" + zakroucenost +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
