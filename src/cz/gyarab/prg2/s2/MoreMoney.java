package cz.gyarab.prg2.s2;

import java.util.concurrent.ThreadLocalRandom;

public class MoreMoney {
    public static void main(String[] args) {

        // s-0 e-1 n-2 d-3 m-4 o-5 r-6 y-7
        int[] cisla = new int[8];
        for(;;) {
            for (int i = 0; i < cisla.length; i++) {
                cisla[i] = ThreadLocalRandom.current().nextInt(0, 10);
            }

            int send = cisla[0]*1000 + cisla[1]*100 + cisla[2]*10 +cisla[3];
            int more = cisla[4]*1000 + cisla[5]*100 + cisla[6]*10 +cisla[1];
            int money = cisla[4]*10000 + cisla[5]*1000 + cisla[2]*100 + cisla[1]*10 +cisla[7];

            if (send + more == money) {
                System.out.println("" + send + " + " + more + " = " + money);
                return;
            }
        }

    }
}
