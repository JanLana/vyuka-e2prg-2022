package cz.gyarab.prg2.s1;

public class Abc {
    public static void main(String[] args) {
        int n = 0;

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (a == b ) {
                    continue;
                }

                for (int c = 0; c < 10; c++) {
                    n++;

                    if (a != c && b != c
                            && a + b == c) {
                        System.out.println("a:" + a + " b:" + b + " c:" + c);
                    }

                }

            }

        }

        System.out.println(n);
    }
}
