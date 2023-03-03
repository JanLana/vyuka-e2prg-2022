package cz.gyarab.prg2.s2;

public class DedecekABabicka {
    public static void main(String[] args) throws InterruptedException {
        Nuz n = new Nuz();
        Vidlicka v = new Vidlicka();
        n.vidlicka = v;
        v.nuz =n;

        Thread dedecek = new Thread(() -> {
            v.vezmiSiMe();
        });

        Thread babicka = new Thread(() -> {
            v.vezmiSiMe();
        });

        System.out.println("je cas obeda");
        dedecek.start();

        babicka.start();

        System.out.println("jime spolu");

        babicka.join();
        dedecek.join();

        System.out.printf("to byl dobry obed");

    }

}
