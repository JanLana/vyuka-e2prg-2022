package cz.gyarab.prg2.s1;

public class PrvekOSeznamu {
    int hodnota;
    PrvekOSeznamu dalsi;
    PrvekOSeznamu predchozi;

    public PrvekOSeznamu(int hodnota, PrvekOSeznamu dalsi, PrvekOSeznamu predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }

    public PrvekOSeznamu(int hodnota) {
        this.hodnota = hodnota;
        this.dalsi = this.predchozi = null;
    }
}
