package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {
    private String nimi;

    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        
        GridPane aloitusAsettelu = new GridPane();
        Label teksti1 = new Label("Kirjoita nimesi ja aloita.");
        TextField nimiKentta = new TextField();
        Button aloita = new Button("Aloita");
        aloitusAsettelu.add(teksti1, 0, 0);
        aloitusAsettelu.add(nimiKentta, 0,1);
        aloitusAsettelu.add(aloita,0,2);
        
        aloitusAsettelu.setPrefSize(300, 180);
        aloitusAsettelu.setAlignment(Pos.CENTER);
        aloitusAsettelu.setVgap(10);
        aloitusAsettelu.setHgap(10);
        aloitusAsettelu.setPadding(new Insets(20,20,20,20));
        
        Scene aloitus = new Scene(aloitusAsettelu);
        
        StackPane tervehdysAsettelu = new StackPane();
        Label teksti2 = new Label("");
        tervehdysAsettelu.setPrefSize(300, 180);
        tervehdysAsettelu.getChildren().add(teksti2);
        tervehdysAsettelu.setAlignment(Pos.CENTER);
        
        Scene tervehdys = new Scene(tervehdysAsettelu);
        
        aloita.setOnAction((event) -> {
            nimi = nimiKentta.getText();
            teksti2.setText("Tervetuloa " + nimi + "!");
            ikkuna.setScene(tervehdys);
        });
        
        ikkuna.setScene(aloitus);
        ikkuna.show();
        
    }
}
