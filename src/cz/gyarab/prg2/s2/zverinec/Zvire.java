package cz.gyarab.prg2.s2.zverinec;

public abstract class Zvire {
    public void info() {
        System.out.println("Druh: " + mujDruh());
        System.out.println("Trida: " + mojeTrida());
        System.out.println("# nohou: " + mojeNohy());
    }

    public abstract int mojeNohy();
    public abstract String mojeTrida();
    public abstract String mujDruh();


}
