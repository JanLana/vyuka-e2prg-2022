package cz.gyarab.prg2.s2;

public class Maluj extends Thread {
    /*
    public static void malujHvezdicku(int max) {
        for(int i = 0;; i++) {
            for (int j = 0; j < i % max; j++) {
                System.out.print(" ");
            }
            System.out.print("*\r");


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    */
    String slovo;

    int max;

    public Maluj(String jmeno, String slovo) {
        super(jmeno);
        this.slovo = slovo;
    }

    public Maluj(int max) {
        this.max = max;
    }

    public void run() {
        for (int i = 0; i < max; i++) {
            if (cislo > 10) {
            }
            System.out.println(i);
            Thread.yield();
        }
    }

    /*
    public void run() {
        for (Character ch: slovo.toCharArray()) {
            System.out.println("Malir " + getName() + " napsal " + ch);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
     */

    static int cislo;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Maluj m1 = new Maluj(10000);
        Maluj m2 = new Maluj(10000);
        //Maluj m1 = new Maluj("Jan", "Nazdar");
        //Maluj m2 = new Maluj("Pepa", "Dobry den");
        System.out.println("radek 42");
        m1.start();
        System.out.println("radek 44");
        m2.start();
        System.out.println("radek 46");
        m1.join();
        System.out.println("radek 48");

    }
}
