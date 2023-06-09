package cz.gyarab.prg2.s2;

import java.io.*;
import java.util.Scanner;

public class PrvekObousmerny implements Serializable {
    int hodnota;

    PrvekObousmerny dalsi;
    PrvekObousmerny predchozi;

    public PrvekObousmerny(int hodnota, PrvekObousmerny dalsi, PrvekObousmerny predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }


    public static void main(String[] args) throws IOException {
        PrvekObousmerny hlava = null;
        Scanner sc = new Scanner(System.in);

        try {
            FileInputStream f = new FileInputStream("soubor2.dat");
            ObjectInputStream in = new ObjectInputStream(f);
            hlava = (PrvekObousmerny) in.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("stalo se neco spatneho...");
            return;
        } catch (IOException e) {
            hlava = null;
        }

        for (; ; ) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;

            //Prvek novy = new Prvek(vstup, hlava);
            PrvekObousmerny novy = new PrvekObousmerny(vstup, hlava, null);

            // hlava = novy;
            if (hlava != null) {
                hlava.predchozi = novy;
            }

            hlava = novy;
        }

        FileOutputStream f2 = new FileOutputStream("soubor2.dat");
        ObjectOutputStream out = new ObjectOutputStream(f2);
        out.writeObject(hlava);
        out.close();
    }
}
