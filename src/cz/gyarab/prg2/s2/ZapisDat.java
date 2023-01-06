package cz.gyarab.prg2.s2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ZapisDat {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fn = new File("data.dat");

        // nacti arr ze souboru data.dat
        ArrayList<Clovek2> arr;
        if (fn.exists()) {
            FileInputStream in = new FileInputStream(fn);
            ObjectInputStream oi = new ObjectInputStream(in);
            arr = (ArrayList<Clovek2>) oi.readObject();
        } else {
            arr = new ArrayList<Clovek2>();
        }

        // vytvor noveho cloveka z udaju z klavesnice
        Scanner sc = new Scanner(System.in);
        Clovek2 novy = new Clovek2(sc);
        arr.add(novy);

        // zapis cloveka do souboru
        FileOutputStream out = new FileOutputStream(fn);
        ObjectOutputStream oo = new ObjectOutputStream(out);
        oo.writeObject(arr);
        out.close();
    }
}
