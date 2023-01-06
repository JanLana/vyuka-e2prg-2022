package cz.gyarab.prg2.s2;

import org.apache.commons.lang.RandomStringUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class Ovoce implements Serializable, Comparable<Ovoce> {
    String jmeno;

    public Ovoce(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "Ovoce{" +
                "jmeno='" + jmeno + '\'' +
                '}';
    }

    public static String nahodneJmeno() {
        //byte[] array = new byte[7]; // length is bounded by 7
        //new Random().nextBytes(array);
        //return new String(array, Charset.forName("UTF-8"));
        return  RandomStringUtils.randomAlphabetic(10);
    }

    public static void main(String[] args) throws IOException {
        Random rnd = new Random();

        ArrayList<Ovoce> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(new Banan(nahodneJmeno(), rnd.nextDouble()));
            arr.add(new Jahoda(nahodneJmeno(), rnd.nextInt()));
        }

        System.out.println(arr);

        FileOutputStream f = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(arr);
        out.close();
    }

    @Override
    public int compareTo(Ovoce o) {
        return jmeno.compareTo(o.jmeno);
    }
}
