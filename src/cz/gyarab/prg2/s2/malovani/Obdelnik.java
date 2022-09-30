package cz.gyarab.prg2.s2.malovani;

import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Obdelnik extends GrafickyPrvek {
    int startX;
    int startY;
    int velikostX;
    int velikostY;

    public Obdelnik(int startX, int startY, int velikostX, int velikostY) {
        super();
        System.out.println("konstruktor Obdelnik");
        this.startX = startX;
        this.startY = startY;
        this.velikostX = velikostX;
        this.velikostY = velikostY;
    }

    public Path namalujSe() {
        Path path = new Path();

        MoveTo moveTo = new MoveTo(startX, startY);
        LineTo line1 = new LineTo(startX + velikostX, startY);
        LineTo line2 = new LineTo(startX + velikostX,startY + velikostY);
        LineTo line3 = new LineTo(startX,startY + velikostY);
        LineTo line4 = new LineTo(startX, startY);

        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4);

        return path;
    }
}
