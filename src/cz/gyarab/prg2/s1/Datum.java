package cz.gyarab.prg2.s1;

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
        int x = rok - o.rok;
        if (x != 0)
            return x;
;

        /* urcite rok == o.rok */
        return 0;
    }


    @Override
    public String toString() {
        return den + "." + mesic + "." + rok;
    }



    public static void main(String[] args) {
        Datum[] arr = {
                new Datum(25, 11, 2022),
                new Datum(1,1,1970),
                new Datum(6,11,1974),
                new Datum(1,1,2200),
                new Datum(1,1,2022)
        };

        Arrays.sort(arr);

        for (Datum d: arr) {
            System.out.println(d);
        }

    }

}
