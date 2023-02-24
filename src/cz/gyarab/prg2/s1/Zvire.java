package cz.gyarab.prg2.s1;

import org.apache.commons.lang.RandomStringUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Zvire implements Serializable, Comparable<Zvire> {
    String jmeno;

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "Zvire{" +
                "jmeno='" + jmeno + '\'' +
                '}';
    }

    public static String nahodneJmeno() {
        //byte[] array = new byte[7]; // length is bounded by 7
        //new Random().nextBytes(array);
        //return new String(array, Charset.forName("UTF-8"));
        return RandomStringUtils.randomAlphabetic(10);
    }


    public static void main(String[] args) throws IOException {
        ArrayList<Zvire> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(new Had( 10));
            arr.add(new Kocka(nahodneJmeno(), 7));
        }

        FileOutputStream f = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(arr);
        out.close();

        System.out.println(arr);
    }

    @Override
    public int compareTo(Zvire o) {
        return jmeno.compareTo(o.jmeno);
    }

}
