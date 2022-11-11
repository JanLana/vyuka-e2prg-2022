package cz.gyarab.prg2.s2.malovani;

/*
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Ctverec extends GrafickyPrvek {
    int startX;
    int startY;
    int velikost;

    public Ctverec(int startX, int startY, int velikost) {
        this.startX = startX;
        this.startY = startY;
        this.velikost = velikost;
    }

    public Path namalujSe() {
        Path path = new Path();

        MoveTo moveTo = new MoveTo(startX, startY);
        LineTo line1 = new LineTo(startX + velikost, startY);
        LineTo line2 = new LineTo(startX + velikost,startY + velikost);
        LineTo line3 = new LineTo(startX,startY + velikost);
        LineTo line4 = new LineTo(startX, startY);

        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4);

        return path;
    }
}

 */