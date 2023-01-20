package cz.gyarab.prg2.s1;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.*;

public class UlozLidiXML {
    public static void main(String[] args) throws IOException {
        Clovek[] arr = {
                new Clovek("pepa", "z depa", 1900),
                new Clovek("Jara", "Cimrman", 1850),
        };

        for (Clovek c: arr) {
            System.out.println(c);
        }


        File file = new File("test.xml");


        XStream xstream = new XStream();
        /*
        try (FileWriter out = new FileWriter(file)) {
            out.write(xstream.toXML(arr));
        }

         */
        xstream.addPermission(AnyTypePermission.ANY);
        try (FileReader in = new FileReader(file)) {
            Clovek[] arr2 = (Clovek[]) xstream.fromXML(in);

            for (Clovek c: arr2) {
                System.out.println(c);
            }
        }



    }
}
