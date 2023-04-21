package cz.gyarab.prg2.s1;

public class Polynom {
    static double spocitejHodnotu(double x) {
        // x^4 + 10x^3 ...
        return Math.pow(x,4) + 10 * Math.pow(x,3) + 35*x*x + 50*x + 24;
    }

    static double spocitejHodnotuH(double x) {
        double b4 = 1;
        double b3 = 10 + b4 * x;
        double b2 = 35 + b3 * x;
        double b1 = 50 + b2 * x;
        double b0 = 24 + b1 * x;

        double b = 1;
        b = 10 + b*x;
        b = 35 + b*x;
        b = 50 + b*x;
        b = 24 + b*x;

        return b0;
    }


    public static void main(String[] args) {
        for (double i = -1.0; i < 1.0; i += 0.1) {
            System.out.println("f(" + i + ") = " + spocitejHodnotu(i));
        }
    }
}
