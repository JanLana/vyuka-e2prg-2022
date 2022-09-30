package cz.gyarab.prg2.s2.malovani;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MojeMalovani extends Application {
    List<GrafickyPrvek> mojeScena;

    public MojeMalovani() {
        mojeScena = new ArrayList<>();

        mojeScena.add(new GrafickyPrvek());
        mojeScena.add(new Ctverec(0,0,100));
        mojeScena.add(new Obdelnik(200,200,200, 10));
        for (int i = 0; i < 50; i+=3) {
            mojeScena.add(new Ctverec(i,i,100-2*i));
            mojeScena.add(new Ctverec(i+50,i+50,100+2*i));
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        for (GrafickyPrvek n: mojeScena) {
            root.getChildren().add(n.namalujSe());
        }

        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}