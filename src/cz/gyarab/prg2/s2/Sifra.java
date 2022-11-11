package cz.gyarab.prg2.s2;

public class Sifra {
    public static void main(String[] args) {
        String vstup = "wlyib evxvi,\n" +
                "klwzirol hv nr wzhvmpf ilaofhgrg.\n" +
                "ofhgro qhvn klalilezmrn qvwmlkrhnvmbxs z welfkrhnvmbxs hole.\nmvqerxv nr zov kir ivhvmr klnlsol kilolnvmr holez vakra, pgviv qhvn kivkhzo wl klwlyb zyxwvx,\npgvilf qhvn mvxszo eozhgmrn kiliznvn ebsovwzg e yryor. kir sovwzmr nvar hgl kzwvhzgr ebhovwpb\nnr klnlsol gl, av qhvn hr ybo xvopvn qrhgb, av givgr krhnvml qv z.\na ebhovwpf nr kzp aybob qvm wev holez: lgzapznr z wezpizg. pwbyb e gvgf mvybob azxslezmb nvavib, ybol yb ivhvmr nmlsvn lygramvqhr z gvmgl klhgfk yb mvfmlezo.\n" +
                "elqgz";

        for (Character ch: vstup.toCharArray()) {
            switch(ch) {
                case 'e': ch = 'V'; break;
                case 'l': ch = 'O'; break;
                case 'q': ch = 'J'; break;
                case 'g': ch = 'T'; break;
                case 'z': ch = 'A'; break;

                case 'w': ch = 'D'; break;
                case 'y': ch = 'B'; break;
                case 'i': ch = 'R'; break;
                case 'b': ch = 'Y'; break;

                case 'v': ch = 'E'; break;
                case 'x': ch = 'C'; break;

                case 'p': ch = 'K'; break;
                default: ch = ch;
            }
            System.out.print(ch);

        }
    }
}
