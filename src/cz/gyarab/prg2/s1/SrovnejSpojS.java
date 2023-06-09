package cz.gyarab.prg2.s1;

import java.util.Scanner;

public class SrovnejSpojS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrvekSpojovehoSeznamu hlava = new PrvekSpojovehoSeznamu(0);

        for(;;) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            PrvekSpojovehoSeznamu novy = new PrvekSpojovehoSeznamu(vstup);

            for (PrvekSpojovehoSeznamu i = hlava; i != null; i = i.dalsi) {
                if (i.dalsi == null) {
                    i.dalsi = novy;
                    break;
                } else if (i.dalsi.hodnota >= vstup) {
                    novy.dalsi = i.dalsi;
                    i.dalsi = novy;
                    break;
                }
            }
        }

        for (PrvekSpojovehoSeznamu p = hlava; p != null; p = p.dalsi) {
            System.out.println(p.hodnota);
        }
    }
}
