package cz.gyarab.prg2.s2;

import java.util.Scanner;

public class CtiAVypis extends Thread {
    CtiAVypisHlava hlava;

    public CtiAVypis(CtiAVypisHlava hlava) {
        this.hlava = hlava;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            // hlava = new Prvek(vstup, hlava);
            hlava.setHlava(new Prvek(vstup, hlava.getHlava()));
        }
    }
}
