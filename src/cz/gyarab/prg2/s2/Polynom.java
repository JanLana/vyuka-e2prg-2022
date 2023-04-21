package cz.gyarab.prg2.s2;

public class Polynom {
    static double[] a = {24, 50, 35, 10, 1};

    static double pocitej1(double x) {
        return //x*x*x*x*a[4] +
                Math.pow(x, 4) +
                x*x*x*a[3] +
                x*x*a[2] +
                x*a[1] +
                a[0];
    }

    static double pocitej2(double x) {
        double b4 = a[4];
        double b3 = a[3] + b4 * x;
        double b2 = a[2] + b3 * x;
        double b1 = a[1] + b2 * x;
        double b0 = a[0] + b1 * x;

        return b0;
    }

    static double pocitej3(double x) {
        double b = a[4];
        b = a[3] + b * x;
        b = a[2] + b * x;
        b = a[1] + b * x;
        b = a[0] + b * x;

        return b;
    }


    public static void main(String[] args) {
        for (double x = 0.0; x < 1.0; x+=0.1) {
            System.out.println("P(" + x + ") = " + pocitej1(x));

        }

    }
}
