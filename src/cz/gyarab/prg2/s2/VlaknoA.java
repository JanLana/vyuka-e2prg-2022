package cz.gyarab.prg2.s2;

import cz.gyarab.prg2.s1.VelkePole;

public class VlaknoA extends Thread {
    VelkePole arr;

    public VlaknoA(VelkePole arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.delkaPole(); i++) {
            arr.prictiJedna(i);
        }
    }
}
