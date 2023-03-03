package cz.gyarab.prg2.s2;

public class Vidlicka {
    Nuz nuz;
    synchronized void vezmiSiMe() {
        System.out.println("nekdo si vzal VIDLICKU");
        nuz.jimeSpolu();
    }
    synchronized void jimeSpolu() {
        System.out.println("jime V+N");
    }

}
