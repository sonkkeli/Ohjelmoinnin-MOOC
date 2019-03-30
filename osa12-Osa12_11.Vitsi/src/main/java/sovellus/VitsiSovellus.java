package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VitsiSovellus extends Application{

    @Override
    public void start(Stage ikkuna){
        BorderPane asettelu = new BorderPane();
        asettelu.setPrefSize(300, 180);
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);
        
        Button nappi1 = new Button("Vitsi");
        Button nappi2 = new Button("Vastaus");
        Button nappi3 = new Button("Selitys");
        valikko.getChildren().addAll(nappi1,nappi2,nappi3);
        Label keskio = new Label("What do you call a bear with no teeth?");
        String vitsi = "What do you call a bear with no teeth?";
        String vastaus = "A gummy bear.";
        String selitys = "An extremely shitty joke for dummies.";
        
        asettelu.setTop(valikko);
        asettelu.setCenter(keskio);
        
        nappi1.setOnAction((event) -> {
            keskio.setText(vitsi);
        });
        
        nappi2.setOnAction((event) -> {
            keskio.setText(vastaus);
        });
        nappi3.setOnAction((event) -> {
            keskio.setText(selitys);
        });
        
        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();        
    }

    public static void main(String[] args) {
        launch(VitsiSovellus.class);
    }
}
