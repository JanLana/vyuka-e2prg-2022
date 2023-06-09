package cz.gyarab.prg2.s2;

import java.util.Scanner;

public class ZatridSpojS {
    public static void main(String[] args) {
        Prvek hlava = new Prvek(0);
        Scanner sc = new Scanner(System.in);

        for(;;) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            Prvek novy = new Prvek(vstup);

            // pridam na spravne misto
            for (Prvek predchozi = hlava; predchozi != null; predchozi = predchozi.dalsi) {
                Prvek i = predchozi.dalsi;
                if (i == null) {
                    predchozi.dalsi = novy;
                } else if (i.hodnota > vstup) {
                    novy.dalsi = i.dalsi;
                    i.dalsi = novy;
                    break;
                }
            }
        }

        for (Prvek i = hlava.dalsi; i != null; i = i.dalsi) {
            System.out.println(i.hodnota);
        }
    }
}
