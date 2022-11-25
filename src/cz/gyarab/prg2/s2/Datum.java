package cz.gyarab.prg2.s2;

import java.util.Arrays;

public class Datum implements Comparable<Datum> {
    int den;
    int mesic;
    int rok;

    public Datum(int den, int mesic, int rok) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }


    @Override
    public int compareTo(Datum o) {
        if (rok < o.rok)
            return -1;

        if (rok > o.rok)
            return 123;

        /* urcite rok == o.rok */
        return 0;
    }


    @Override
    public String toString() {
        return "Datum{" +
                "den=" + den +
                ", mesic=" + mesic +
                ", rok=" + rok +
                '}';
    }

    public static void main(String[] args) {
        Datum[] seznam = {
                new Datum(2, 2, 1900),
                new Datum(25, 11, 2022),
                new Datum(1, 1, 1970),
                new Datum(6, 11, 1974),
                new Datum(1, 1, 1900),
        };

        Arrays.sort(seznam);

        for(Datum d: seznam) {
            System.out.println(d);
        }
    }

}
