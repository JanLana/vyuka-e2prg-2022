package cz.gyarab.prg2.s1;

import java.io.Serializable;
import java.util.Scanner;

public class Clovek implements Serializable {
    String krestni;
    String prijmeni;
    int rokNarozeni;

    public Clovek(String krestni, String prijmeni, int rokNarozeni) {
        this.krestni = krestni;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }

    public Clovek(Scanner sc) {
        krestni = sc.next();
        prijmeni = sc.next();
        rokNarozeni = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "krestni='" + krestni + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", rokNarozeni=" + rokNarozeni +
                '}';
    }
}
