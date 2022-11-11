package cz.gyarab.prg2.s1;

public class CeleCislo implements UmiSePorovnat, Comparable {
    int cislo;

    public CeleCislo(int cislo) {
        this.cislo = cislo;
    }

    public boolean jsemVetsiNez(UmiSePorovnat druhyPrvek) {
        CeleCislo x = (CeleCislo)druhyPrvek;
        if (cislo > x.cislo) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "cislo=" + cislo;
    }

    public int compareTo(Object o) {
        CeleCislo x = (CeleCislo)o;
        if (cislo > x.cislo) {
            return 1;
        } if (cislo == x.cislo) {
            return 0;
        } else {
            return -1;
        }
    }
}
