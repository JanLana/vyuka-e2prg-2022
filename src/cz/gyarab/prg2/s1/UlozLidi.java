package cz.gyarab.prg2.s1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UlozLidi {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("test.dat");

        // nactu co zatim mam v test.dat
        FileInputStream f = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(f);
        in.close();
        f.close();

        ArrayList<Clovek> arr = (ArrayList<Clovek>)in.readObject();

        // pridej noveho cloveka
        Scanner sc = new Scanner(System.in);
        Clovek novy = new Clovek(sc);
        arr.add(novy);

        // zapis to
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(arr);
        out.close();
        fo.close();
    }
}
