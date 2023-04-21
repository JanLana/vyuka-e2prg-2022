package cz.gyarab.prg2.s1;

public class BitoveOperace {
    static void do2(byte b) {
        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        System.out.println(s1);
    }

    static byte nastavBit(byte aktualniHodnota, int odNulaDoSedmi) {
        return (byte) (aktualniHodnota  | (1<<odNulaDoSedmi));
    }

    public static void main(String[] args) {
        byte x = 0;

        do2(x); // 00000000
        x = nastavBit(x, 2);
        do2(x); // 00000100
        x = nastavBit(x, 7);
        do2(x); // 10000100


        do2((byte) 9);


    }
}
