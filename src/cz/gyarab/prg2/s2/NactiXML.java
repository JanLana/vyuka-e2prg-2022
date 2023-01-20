package cz.gyarab.prg2.s2;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.*;

public class NactiXML {
    public static void main(String[] args) throws IOException {


        XStream xstream = new XStream();
        xstream.addPermission(AnyTypePermission.ANY);


        Clovek2[] arr;

        try (Reader in = new FileReader("soubor.xml")) {
            arr = (Clovek2[]) xstream.fromXML(in);
        }

        for (Clovek2 c: arr) {
            System.out.println(c);
        }

    }
}
