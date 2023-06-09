package cz.gyarab.prg2.s2;

public class CtiAVypisVypis extends Thread {
    CtiAVypisHlava hlava;

    public CtiAVypisVypis(CtiAVypisHlava hlava) {
        this.hlava = hlava;
    }
    
    public void run() {

        for(;;) {
            if (hlava.getHlava() != null) {
                System.out.println(hlava.getHlava().hodnota);

                //hlava = hlava.dalsi;
                hlava.setHlava(hlava.getHlava().dalsi);
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("nemuzu spat, nekdo me budi!!!!");
            }

        }

    }
}
