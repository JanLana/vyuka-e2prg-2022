package cz.gyarab.prg2.s2;

public class Nuz {
    Vidlicka vidlicka;

    synchronized void vezmiSiMe() {
        System.out.println("nekdo si vzal NUZ");
        vidlicka.jimeSpolu();
    }

    synchronized void jimeSpolu() {
        System.out.println("jime N+V");
    }
}
