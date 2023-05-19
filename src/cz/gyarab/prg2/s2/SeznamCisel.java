package cz.gyarab.prg2.s2;

import java.util.Scanner;

public class SeznamCisel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prvek hlava = null;

        for(;;) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            // pridej vstup do seznamu
            /*
            Prvek novy = new Prvek(vstup, null);
            novy.dalsi = hlava;
            hlava = novy;
             */
            hlava = new Prvek(vstup, hlava);
        }

        /*
        Prvek aktualni = hlava;
        while(aktualni != null) {
            System.out.println(aktualni.hodnota);
            aktualni = aktualni.dalsi;
        }
        */

        for(Prvek i = hlava; i != null; i = i.dalsi) {
            System.out.println(i.hodnota);
        }
        // vypis cely seznam
    }
}
