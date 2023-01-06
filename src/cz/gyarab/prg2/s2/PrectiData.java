package cz.gyarab.prg2.s2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PrectiData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fn = new File("data.dat");
        FileInputStream in = new FileInputStream(fn);
        ObjectInputStream oi = new ObjectInputStream(in);

        //Object o = oi.readObject();
        //Clovek2 nactenyClovek = (Clovek2)o;
        //Clovek2 nactenyClovek = (Clovek2)oi.readObject();
        ArrayList<Clovek2> arr = (ArrayList<Clovek2>)oi.readObject();

        System.out.println(arr);
    }
}
