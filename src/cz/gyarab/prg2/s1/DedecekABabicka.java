package cz.gyarab.prg2.s1;

public class DedecekABabicka {
    public static void main(String[] args) throws InterruptedException {
        Nuz n = new Nuz();
        Vidlicka v = new Vidlicka();

        v.nuz = n;
        n.vidlicka = v;

        Thread dedecek = new Thread(() -> {
            n.vezmiSiMe();
        });

        Thread babicka = new Thread(() -> {
            v.vezmiSiMe();
        });

        dedecek.start();
        babicka.start();

        dedecek.join();
        babicka.join();

        System.out.println("je po obede");
    }
}
