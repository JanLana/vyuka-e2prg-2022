package cz.gyarab.prg2.s2;

public class PoleVBajtu {
    static void pr(byte b) {
        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');

        System.out.println(s1);
    }

    static byte nastavBit(byte aktualniStav, int kteryBitMamZmenit) {
        return (byte) (aktualniStav | (1 << kteryBitMamZmenit));
    }

    public static void main(String[] args) {
        byte b = 0;
        pr(b);  //00000000
        b = nastavBit(b, 0);
        pr(b);  //00000001
        b = nastavBit(b, 4);
        pr(b);  //00010001
        b = nastavBit(b, 7);
        pr(b);  //10010001

    }
}
