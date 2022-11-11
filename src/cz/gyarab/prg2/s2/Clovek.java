package cz.gyarab.prg2.s2;

import cz.gyarab.prg2.s2.zverinec.Pes;

public class Clovek implements UmiSeTridit, Comparable {
    boolean jeMuz;
    double vaha; // v kg

    public Clovek(boolean jeMuz, double vaha) {
        this.jeMuz = jeMuz;
        this.vaha = vaha;
    }

    public boolean jsemVetsiNez(UmiSeTridit x) {
        Clovek b = (Clovek)x;
        if (jeMuz == true && b.jeMuz == false) {
            return true;
        } else if (jeMuz == false && b.jeMuz == true) {
            return false;
        } else if (vaha > b.vaha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "jeMuz=" + jeMuz +
                ", vaha=" + vaha +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Clovek b = (Clovek)o;
            if (jeMuz == true && b.jeMuz == false) {
                return 1;
            } else if (jeMuz == false && b.jeMuz == true) {
                return -1;
            } else if (vaha > b.vaha) {
                return 1;
            } else if (vaha < b.vaha){
                return -1;
            } else {
                return 0;
            }
        }

    }
}
