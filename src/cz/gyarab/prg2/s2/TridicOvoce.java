package cz.gyarab.prg2.s2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TridicOvoce {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("soubor.dat");
        ObjectInputStream in = new ObjectInputStream(f);
        ArrayList<Ovoce> arr = (ArrayList<Ovoce>)in.readObject();
        Collections.sort(arr);
        System.out.println(arr);

    }
}
