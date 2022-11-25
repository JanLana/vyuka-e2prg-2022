package cz.gyarab.prg2.s2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrectiSoubor {
    public static void main(String[] args) throws IOException {
        File fn = new File("LICENSE");
        FileReader r = new FileReader(fn);
        Scanner sc = new Scanner(r);

        for (int i = 0; i < 5; i++) {
            System.out.println(sc.next());
        }

        System.out.println("========");

        int slov = 0;

        for (;;) {
            int x = r.read();
            if (x == -1)
                return;

            char ch = (char) x;

            if (Character.isSpaceChar(ch)) {
                slov++;
                if (slov == 4)
                    break;
            }

            System.out.print(ch);
        }
    }
}
