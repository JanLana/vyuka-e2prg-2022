package cz.gyarab.prg2.s1;

public class MojeV1 extends Thread {
    VelkePole p;

    public MojeV1(VelkePole p) {
        this.p = p;
    }
    
    public void run() {
        for (int i = 0; i < p.delkaPole(); i++) {
            p.prictiJedna(i);
        }
    }
}
