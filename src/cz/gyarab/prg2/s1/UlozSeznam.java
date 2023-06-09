package cz.gyarab.prg2.s1;

import java.io.*;
import java.util.Scanner;

public class UlozSeznam extends Thread {
    volatile PrvekSpojovehoSeznamu hlava = null;

    public void run() {
        for(;;) {
            //System.out.println("run..." + hlava);
            while (hlava != null) {
                System.out.println(hlava.hodnota);
                hlava = hlava.dalsi;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("neco spatneho se stalo ....");
                }
            }
        }
    }

    public void ctiVstup() {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            hlava = new PrvekSpojovehoSeznamu(vstup, hlava);
        }
    }




    public static void main(String[] args) throws IOException {
        /*
        try {
            FileInputStream f = new FileInputStream("soubor.dat");
            ObjectInputStream in = new ObjectInputStream(f);
            hlava = (PrvekSpojovehoSeznamu) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            hlava = null;
        }
         */
        UlozSeznam o = new UlozSeznam();

        o.start();

        o.ctiVstup();


        /*
        for (PrvekSpojovehoSeznamu p = hlava; p != null; p = p.dalsi) {
            System.out.println(p.hodnota);
        }

        FileOutputStream f = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(hlava);
        */
    }

}
