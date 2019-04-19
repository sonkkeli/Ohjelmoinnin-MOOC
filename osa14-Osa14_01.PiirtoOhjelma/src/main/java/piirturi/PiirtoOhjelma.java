package piirturi;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PiirtoOhjelma extends Application {

    public void start(Stage stage) {
        final int leveys = 640;
        final int korkeus = 480;

        stage.setTitle("Piirto-ohjelma");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas piirtoalusta = new Canvas(leveys, korkeus);
        root.getChildren().add(piirtoalusta);

        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        int[][] piirrettavaAlue = new int[leveys][korkeus];

        scene.setOnMouseClicked((MouseEvent e) -> {
            int x = (int) e.getX();
            int y = (int) e.getY();

            piirrettavaAlue[x][y] = 1;
        });
        
        scene.setOnMouseDragged((MouseEvent e) -> {
            int x = (int) e.getX();
            int y = (int) e.getY();
            
            piirrettavaAlue[x][y] = 1;
        });

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                piirturi.setFill(Color.WHITE);
                piirturi.clearRect(0, 0, leveys, korkeus);
                piirturi.setFill(Color.BLACK);
                
                int y = 0;
                while (y < korkeus){                    
                    int x = 0;
                    while (x < leveys){
                        if (piirrettavaAlue[x][y] == 1){
                            piirturi.fillRect(x, y, 2, 2);                        
                        }
                        x++;
                    }
                    y++;
                }
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
