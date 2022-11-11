package cz.gyarab.prg2.s1;

import java.util.Arrays;

public class BubbleSort {
    /*
    public static void setrid(UmiSePorovnat[] arr) {
        boolean potrebujeToSetridit = true;

        while(potrebujeToSetridit) {
            potrebujeToSetridit = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1].jsemVetsiNez(arr[i])) {
                    potrebujeToSetridit = true;

                    UmiSePorovnat k = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = k;
                }

            }
        }
    }
*/
    public static void main(String[] args) {
        CeleCislo[] arr = { new CeleCislo(13),
                new CeleCislo(4),
                new CeleCislo(128),
                new CeleCislo(1),
                new CeleCislo(7),
                new CeleCislo(10)
        };

        Arrays.sort(arr);

        for (CeleCislo i: arr) {
            System.out.println(i);
        }
    }
}
