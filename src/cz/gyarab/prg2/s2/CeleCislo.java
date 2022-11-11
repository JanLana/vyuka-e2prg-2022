package cz.gyarab.prg2.s2;

public class CeleCislo implements UmiSeTridit {
    int cislo;

    public CeleCislo(int cislo) {
        this.cislo = cislo;
    }

    public boolean jsemVetsiNez(UmiSeTridit x) {
        CeleCislo b = (CeleCislo)x;

        return cislo > b.cislo;
    }
}

