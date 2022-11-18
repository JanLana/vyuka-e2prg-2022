package cz.gyarab.prg2.s2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class SeznamSouboru {
    public static void main(String[] args) {
        File f = new File("z:/");
        ArrayList<JedenSoubor> arr = new ArrayList<>();

        for (String jmeno : f.list()) {
            arr.add(new JedenSoubor(jmeno));
        }

        Collections.sort(arr);

        for (JedenSoubor j : arr) {
            System.out.println(j.jmeno);
        }
    }
}
