package cz.gyarab.prg2.s1;

public class Pismomalir extends Thread {
    String napis;

    public Pismomalir(String napis) {
        this.napis = napis;
    }

    public void run() {
        for(char ch: napis.toCharArray()) {
            System.out.println(ch);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                return;
            }
        }
    }


    public static void main(String[] args) {
        Pismomalir p1 = new Pismomalir("Nazdar");
        Pismomalir p2 = new Pismomalir("Ahoj");
        Pismomalir p3 = new Pismomalir("DobryDen");

        System.out.println("startuju p1");
        p1.start();
        System.out.println("startuju p2");
        p2.start();
        System.out.println("startuju p3");
        p3.start();
        System.out.println("mam hotovo");
    }


}
