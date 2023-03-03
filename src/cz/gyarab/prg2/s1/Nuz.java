package cz.gyarab.prg2.s1;

public class Nuz {
    Vidlicka vidlicka;

    public synchronized void vezmiSiMe() {
        System.out.println("vzal jsem si Nuz");
        vidlicka.najezse();
    }


    public synchronized void najezse() {
        System.out.println("jime");
    }
}
