package cz.gyarab.prg2.s1;

public class Jablko {
    // atributy
    double vahaVGramech;
    String barva;

    // metody

    // konstruktor

    public Jablko() {
        vahaVGramech = 100;
        barva = "neznama";
    }

    public Jablko(double vahaVGramech, String barva) {
        this.vahaVGramech = vahaVGramech;
        this.barva = barva;
    }

    @Override
    public String toString() {
        return "Jablko:" + vahaVGramech + "g, " + barva;
    }
}