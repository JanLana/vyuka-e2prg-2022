package cz.gyarab.prg2.s1;

public class TestVlaken extends Thread {
    public static volatile int hodnota;  //volatile = necachovat na procesoru

    static synchronized void prictiJedna() {
        hodnota++;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            prictiJedna();
        }
    }

    public static void main(String []args) throws InterruptedException {
        TestVlaken t1 = new TestVlaken();
        TestVlaken t2 = new TestVlaken();

        t1.start();
        t2.start();

        t1.join();
        t2.join();    // pocka az vlakno t2 skonci

        System.out.println(hodnota);
    }
}