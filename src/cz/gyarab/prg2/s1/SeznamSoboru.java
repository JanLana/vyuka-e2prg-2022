package cz.gyarab.prg2.s1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class SeznamSoboru {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        for (String jmeno: new File("z:/").list()) {
            JedenSoubor s = new JedenSoubor(jmeno);
            arr.add(s);
        }

        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
