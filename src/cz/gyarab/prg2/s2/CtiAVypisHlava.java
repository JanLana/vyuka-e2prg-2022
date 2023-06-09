package cz.gyarab.prg2.s2;

public class CtiAVypisHlava {
    Prvek hlava;

    public CtiAVypisHlava() {
        this.hlava = null;
    }

    public Prvek getHlava() {
        return hlava;
    }

    public void setHlava(Prvek novaHlava) {
        hlava = novaHlava;
    }

    public static void main(String[] args) {
        CtiAVypisHlava h = new CtiAVypisHlava();

        Thread vlakno1 = new CtiAVypis(h);
        Thread vlakno2 = new CtiAVypisVypis(h);

        vlakno1.start();
        vlakno2.start();

    }
}
