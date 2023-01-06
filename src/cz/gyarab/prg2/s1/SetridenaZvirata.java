package cz.gyarab.prg2.s1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SetridenaZvirata {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("soubor.dat");
        ObjectInputStream in = new ObjectInputStream(f);
        ArrayList<Zvire> zvirata= (ArrayList<Zvire>) in.readObject();

        Collections.sort(zvirata);

        System.out.println(zvirata);
    }
}
