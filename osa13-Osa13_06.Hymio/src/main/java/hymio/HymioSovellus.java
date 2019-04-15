package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HymioSovellus extends Application {
    
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();        
        Canvas canvas = new Canvas(400,400);
        GraphicsContext draw = canvas.getGraphicsContext2D();
        
        
        layout.setCenter(canvas);
        draw.fillRect(100, 50, 50, 50);
        draw.fillRect(250, 50, 50, 50);
        draw.fillRect(50, 200, 50, 50);
        draw.fillRect(300, 200, 50, 50);
        draw.fillRect(100, 250, 200, 50);
        
        Scene nakyma = new Scene(layout);

        window.setScene(nakyma);
        window.show();
    }


    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

}
