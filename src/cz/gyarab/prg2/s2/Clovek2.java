package cz.gyarab.prg2.s2;

import java.io.Serializable;
import java.util.Scanner;

public class Clovek2 implements Serializable {
    String krestniJmeno;
    int vaha;

    public Clovek2(String krestniJmeno, int vaha) {
        this.krestniJmeno = krestniJmeno;
        this.vaha = vaha;
    }

    public Clovek2(Scanner sc) {
        krestniJmeno = sc.next();
        vaha = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Clovek2{" +
                "krestniJmeno='" + krestniJmeno + '\'' +
                ", vaha=" + vaha +
                '}';
    }
}
