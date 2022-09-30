package cz.gyarab.prg2.s1;

public class OvocnySad {
    public static void main(String[] args) {
        Jablko j1 = new Jablko();
        j1.vahaVGramech = 100;
        j1.barva = "zelena";
        //System.out.println("Jablko: vaha="+j1.vahaVGramech + "barva:" + j1.barva);

        Jablko j2 = new Jablko(100, "cervena");
        //System.out.println(j2.toString());
        System.out.println(j1);
        System.out.println(j2);

        KosikJablek k = new KosikJablek(5);
        k.pridejJablko(j1);
        k.pridejJablko(j2);



        Hruska h1 = new Hruska(80, 2);
        Hruska h2 = new Hruska(60, 1.5);

    }
}
