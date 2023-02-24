package cz.gyarab.prg2.s1;

public class Pocitadlo {
    public static void main(String[] args) throws InterruptedException {
        VelkePole v = new VelkePole();

        System.out.println(v.secti());

        Thread t1 = new MojeV1(v);
        Thread t2 = new MojeV1(v);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(v.secti());
    }
}
