package tekstitilastointia;

import java.util.Arrays;
import javafx.scene.control.Label; 
import javafx.scene.control.TextArea; 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application {


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        
        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        Label kirjaimia = new Label("Kirjaimia: 0");
        Label sanoja = new Label("Sanoja: 0");
        Label pisin = new Label("Pisin sana on: ");
        
        tekstit.getChildren().addAll(kirjaimia, sanoja, pisin);        
        TextArea tekstikentta = new TextArea("");
        
        tekstikentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanat = palat.length;
            String pisinsana = Arrays.stream(palat)
                    .sorted((s1,s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            kirjaimia.setText("Kirjaimia: " + merkkeja);
            sanoja.setText("Sanoja: " + sanat);
            pisin.setText("Pisin sana on: " + pisinsana);
            
        });
        
        asettelu.setBottom(tekstit);
        asettelu.setCenter(tekstikentta);
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        
        ikkuna.show();
        
    }

}