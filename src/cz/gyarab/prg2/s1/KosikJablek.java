package cz.gyarab.prg2.s1;

public class KosikJablek {
    int velikost;
    Jablko[] seznam;

    public KosikJablek(int velikost) {
        this.velikost = velikost;
        seznam = new Jablko[velikost];
    }

    public void pridejJablko(Jablko j) {
        int i = 0;

        while(seznam[i] != null) {
            i++;
        }
        seznam[i] = j;
    }
}
