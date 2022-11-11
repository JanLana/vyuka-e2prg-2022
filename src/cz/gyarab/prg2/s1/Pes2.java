package cz.gyarab.prg2.s1;

import cz.gyarab.prg2.s1.zverinec.Savec;

public class Pes2 extends Savec implements UmiSePorovnat {
    float vaha = (float)7.5;

    public float mojeVaha() {
        return vaha;
    }
    public String mujDruh() {
        return "pes";
    }

    @Override
    public int mujPocetNohou() {
        return 4;
    }

    public boolean jsemVetsiNez(UmiSePorovnat druhyPrvek) {
        Pes2 x = (Pes2)druhyPrvek;
        return mojeVaha() > x.mojeVaha();
        /*
        if (mojeVaha() > x.mojeVaha()) {
            return true;
        } else {
            return false;
        }
         */

    }




}