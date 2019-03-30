package ilmoitin;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna){
        
        
        TextField tekstikentta = new TextField();
        Button nappi = new Button("Päivitä");
        Label teksti = new Label();
        
        nappi.setOnAction((event) -> {
            teksti.setText(tekstikentta.getText());
        });
        
        VBox komponenttiryhma = new VBox();
        komponenttiryhma.getChildren().addAll(tekstikentta, nappi, teksti);
        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
