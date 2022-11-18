package cz.gyarab.prg2.s2;

public class JedenSoubor implements Comparable<JedenSoubor> {
    String jmeno;

    public JedenSoubor(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return jmeno;
    }

    @Override
    public int compareTo(JedenSoubor o) {
        char mojeTretiPismeno;
        if (jmeno.length() < 3) {
            mojeTretiPismeno = ' ';
        } else {
             mojeTretiPismeno = jmeno.charAt(2);
        }

        char jehoTretiPismeno = o.jmeno.length() < 3 ? ' ' : o.jmeno.charAt(2);

        if (mojeTretiPismeno == jehoTretiPismeno) {
            return 0;
        } else if (mojeTretiPismeno > jehoTretiPismeno) {
            return 1;
        } else {
            return -1;
        }
    }
}
