package cz.gyarab.prg2.s1;

import java.util.Scanner;

public class UlozObousmernySeznam {
    PrvekOSeznamu hlava = null;

    public void ctiVstup() {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            PrvekOSeznamu novy = new PrvekOSeznamu(vstup);
            novy.dalsi = hlava;
            //novy.predchozi = null;
            if (hlava != null)
                hlava.predchozi = novy;

            hlava = novy;
        }
    }

    public static void main(String[] args) {
        UlozObousmernySeznam o = new UlozObousmernySeznam();
        o.ctiVstup();
    }
}
