package cz.gyarab.prg2.s1;

import cz.gyarab.prg2.s2.VlaknoA;

public class VelkePole {
    int[] arr;

    public VelkePole() {
        arr = new int[1000000];
    }

    public int delkaPole() {
        return arr.length;
    }

    public  synchronized void prictiJedna(int index) {
        int x = arr[index];
        int y = x + 1;
        arr[index] = y;
    }

    public long secti() {
        long out = 0;

        for (int i: arr) {
            out += i;
        }

        return out;
    }

    public static void main(String[] args) throws InterruptedException {
        VelkePole p = new VelkePole();

        System.out.println(p.secti());

        VlaknoA a = new VlaknoA(p);
        VlaknoA b = new VlaknoA(p);
        a.start();
        b.start();

        //System.out.println("Uvar mi kafe!!!");

        a.join();
        b.join();

        System.out.println(p.secti());
    }
}
