package cz.gyarab.prg2.s2;

public class Abc {
    public static void main(String[] args) {
        int n = 0;
        int maxa = 0;
        int maxb = 0;
        int maxc = 0;

        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 0; c <= 10000; c++) {
                    if (a*a + b*b == c*c) {
                        if (maxc < c) {
                            maxa = a;
                            maxb = b;
                            maxc = c;
                        }
                        //System.out.println("" + a + "+" + b + "=" +c);
                        n = n + 1;

                    }

                }

            }

        }
        System.out.println(n);
        System.out.println("" + maxa + "+" + maxb + "=" +maxc);

    }
}
