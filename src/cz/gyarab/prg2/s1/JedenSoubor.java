package cz.gyarab.prg2.s1;

public class JedenSoubor implements Comparable {
    String jmeno;

    public JedenSoubor(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return jmeno;
    }

    @Override
    public int compareTo(Object o) {
        JedenSoubor b = (JedenSoubor) o;

        if (jmeno.length() < 2 && b.jmeno.length() < 2) {
            return 0;
        } else if (jmeno.length() < 2) {
            return -1;
        } else if (b.jmeno.length() < 2) {
            return 1;
        }

        char chMoje = jmeno.charAt(1);
        char chJeho = b.jmeno.charAt(1);

        if (chMoje == chJeho) {
            return 0;
        } else if (chMoje < chJeho) {
            return -1;
        } else {
            return 1;
        }


    }
}
