package cz.gyarab.prg2.s2;

import java.util.Arrays;

public class MojeTrideni {


    static void setridPole(UmiSeTridit[] arr) {
        boolean jePotrebaToSetridit = true;

        while(jePotrebaToSetridit) {
            jePotrebaToSetridit = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1].jsemVetsiNez(arr[i])) {
                    UmiSeTridit x = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = x;

                    jePotrebaToSetridit = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Clovek[] arr = {
                new Clovek(true, 81.5),
                new Clovek(false, 51.0),
                new Clovek(true, 49.0),
                new Clovek(false, 95.0),

        };

        Arrays.sort(arr);



        CeleCislo[] arr2 = {
                new CeleCislo(5),
                new CeleCislo(1),
        };

        setridPole(arr);
        setridPole(arr2);

        for (Clovek c: arr) {
            System.out.println(c);
        }
    }
}
