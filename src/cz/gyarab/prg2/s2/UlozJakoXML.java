package cz.gyarab.prg2.s2;

import com.thoughtworks.xstream.XStream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UlozJakoXML {
    public static void main(String[] args) throws IOException {
        Clovek2[] arr = {
                new Clovek2("Jara", 95),
                new Clovek2("Jezis", 80),
        };

        for (Clovek2 c: arr) {
            System.out.println(c);

        }

        // FileInputStream f = new FileInputStream(file);
        // ObjectInputStream in = new ObjectInputStream(f);

        XStream xstream = new XStream();
        try (FileWriter out = new FileWriter("soubor.xml")) {
            out.write(xstream.toXML(arr));
        }

    }
}
