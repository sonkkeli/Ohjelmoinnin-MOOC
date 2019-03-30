package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstikenttaSovellus extends Application{

    @Override
    public void start(Stage ikkuna){
        Button nappi = new Button("Tämä on nappi");
        TextField teksti = new TextField();
        
        FlowPane ryhma = new FlowPane();
        ryhma.getChildren().add(nappi);
        ryhma.getChildren().add(teksti);
        
        Scene nakyma = new Scene(ryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
