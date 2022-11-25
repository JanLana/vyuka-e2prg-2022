package cz.gyarab.prg2.s1;

import java.io.*;
import java.util.Scanner;

public class NactiSoubor {
    public static void main(String[] args) throws IOException {
        File fn = new File("LICENSE");
        Reader r = new FileReader(fn);
        Scanner sc = new Scanner(r);

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        /*
        for(;;) {
            int x = r.read();
            char ch = (char) x;
            if (ch == ' ')

            System.out.print(ch);
        }

         */
    }
}
