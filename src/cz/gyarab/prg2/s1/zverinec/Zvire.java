package cz.gyarab.prg2.s1.zverinec;

public abstract class Zvire {
    public void info() {
        System.out.println("Druh: " + mujDruh());
        System.out.println("Trida: " + mojeTrida());
        System.out.println("# nohou: " + mujPocetNohou());
    }

    public abstract String mujDruh();

    public abstract String mojeTrida();

    public abstract int mujPocetNohou();




}
