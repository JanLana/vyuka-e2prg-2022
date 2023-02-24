package cz.gyarab.prg2.s2;

public class VlaknoB implements Runnable {
    int max;

    public VlaknoB(int max) {
        this.max = max;
    }

    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }
}
