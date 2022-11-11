package cz.gyarab.prg2.s2.zverinec;

import cz.gyarab.prg2.s2.UmiSeTridit;

public class Pes extends Savec implements UmiSeTridit {
    @Override
    public int mojeNohy() {
        return 4;
    }

    public String mujDruh() {
        return "pes";
    }

    @Override
    public boolean jsemVetsiNez(UmiSeTridit b) {
        return false;
    }
}
