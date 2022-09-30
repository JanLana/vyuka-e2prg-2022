package cz.gyarab.prg2.s2;

public class OvocnySad {
    public static void main(String[] args) {
        Jablko jablko1 = new Jablko();
        jablko1.vaha = 85;
        jablko1.barva = "cervena";
        System.out.println("Jablko: vaha="+ jablko1.vaha + "barva=" + jablko1.barva);

        Jablko jablko2 = new Jablko("zelena", 75);
        System.out.println(jablko2.toString());
        System.out.println(jablko2);

        KosikNaJablka k = new KosikNaJablka(5);
        k.pridejJablko(jablko1);
        k.pridejJablko(jablko2);

        System.out.println(k.toString());




        Hruska h1 = new Hruska(100, 2);
        Hruska h2 = new Hruska(120, 1.5);


    }
}
