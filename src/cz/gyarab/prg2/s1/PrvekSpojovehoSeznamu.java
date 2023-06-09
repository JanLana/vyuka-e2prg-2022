package cz.gyarab.prg2.s1;

import java.io.Serializable;

public class PrvekSpojovehoSeznamu implements Serializable {
    int hodnota;
    PrvekSpojovehoSeznamu dalsi;

    public PrvekSpojovehoSeznamu(int hodnota, PrvekSpojovehoSeznamu dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
    }

    public PrvekSpojovehoSeznamu(int hodnota) {
        this(hodnota, null);
    }
}
