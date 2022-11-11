package cz.gyarab.prg2.s2.zverinec;

public class Zverinec {
    public static void main(String[] args) {
        Zvire[] arr = {new Kocka(), new Pes()};

        for (Zvire z: arr) {
            z.info();
        }

    }
}
