package cz.gyarab.prg2.s2;

import java.util.Scanner;

public class ZatridPole {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);

        for(;;) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            // pridam na spravne misto
            for (int i = 0; arr[i] != 0; i++) {
                if (arr[i] > vstup) {
                    // posun vsechny dalsi privky o jedna
                    arr[i] = vstup;
                    break;
                } /* else {
                    continue
                } */
            }

        }

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
