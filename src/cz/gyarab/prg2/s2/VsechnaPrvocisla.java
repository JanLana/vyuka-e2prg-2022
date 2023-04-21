package cz.gyarab.prg2.s2;

public class VsechnaPrvocisla {
    public static void main(String[] args) {


        boolean[] arr = new boolean[Integer.MAX_VALUE/2];
        int druhaOdmocnina = (int)Math.sqrt(arr.length);

        System.out.println("max value:" + arr.length);
        int pocet = 0;
        for (int i = 2; i < arr.length ; i++) {
            if (arr[i] == false) {
                //System.out.println("prvocislo: " + i);
                pocet++;

                // vyskrtat vsechny nasobky i
                if (i < druhaOdmocnina)
                    for (int j = i; j < arr.length; j = j + i) {
                        arr[j] = true;
                    }

            }
        }
        System.out.println(pocet);

    }
}
