package cz.gyarab.prg2.s1;

public class Pismo extends Thread {
    String slovo;

    public Pismo(String slovo) {
        this.slovo = slovo;
    }

    public void run() {
        for (Character ch: slovo.toCharArray()) {
            System.out.println(ch);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("chyba");
                return;
            }
        }
    }


    public static void main(String[] args) {
        Pismo p1 = new Pismo("Ahoj");
        Pismo p2 = new Pismo("Nazdar");

        System.out.println("krok 1");
        p1.start();
        System.out.println("krok 2");

        p2.start();

        System.out.println("krok 3 - hotovo");


    }
}
