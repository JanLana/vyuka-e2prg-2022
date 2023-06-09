package cz.gyarab.prg2.s1;

import java.util.Scanner;

public class NactiCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrvekSpojovehoSeznamu hlava = null;

        for(;;) {
            int vstup = sc.nextInt();
            if (vstup == 0 )
                break;

            // uloz do seznamu...

            /*
            Prvek novy = new Prvek(vstup, null);
            novy.dalsi = hlava;
            hlava = novy;
            */

            hlava = new PrvekSpojovehoSeznamu(vstup, hlava);
        }

        /*
        Prvek aktualni = hlava;
        while(aktualni != null) {
            System.out.println(aktualni.hodnota);
            aktualni = aktualni.dalsi;
        }
         */

        for(PrvekSpojovehoSeznamu i = hlava; i != null; i = i.dalsi) {
            System.out.println(i.hodnota);
        }

        // vypis seznam
    }
}
