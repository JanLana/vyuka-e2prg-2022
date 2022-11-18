package cz.gyarab.prg2.s1;

import java.io.*;

public class B extends A implements Serializable {
    String prijmeni;

    public B(String jmeno, String prijmeni) {
        // super();
        this.prijmeni = this.jmeno;
    }

    public static void main(String[] args) throws IOException {
        B ja = new B("Jan", "Lana");

        FileOutputStream f = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(ja);
    }
}
