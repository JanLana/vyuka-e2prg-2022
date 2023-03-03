package cz.gyarab.prg2.s1;

public class Vidlicka {
    Nuz nuz;

    public synchronized void vezmiSiMe() {
        System.out.println("vzal jsem si vidlicku");
        nuz.najezse();
    }

    public synchronized void najezse() {
        System.out.println("jime");
    }
}
