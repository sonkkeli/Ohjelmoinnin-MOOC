package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        launch(UseampiNakyma.class);        
    }

    @Override
    public void start(Stage ikkuna) {
        BorderPane ekaAsettelu = new BorderPane();
        Label teksti = new Label("Eka näkymä!");
        Button nappi1 = new Button("Toiseen näkymään!");
        ekaAsettelu.setTop(teksti);
        ekaAsettelu.setCenter(nappi1);        
        Scene eka = new Scene(ekaAsettelu);
        
        VBox tokaAsettelu = new VBox();
        Button nappi2 = new Button("Kolmanteen näkymään!");
        Label teksti2 = new Label("Toka näkymä!");
        tokaAsettelu.getChildren().addAll(nappi2,teksti2);
        Scene toka = new Scene(tokaAsettelu);
        
        GridPane kolmasAsettelu = new GridPane();
        Label teksti3 = new Label("Kolmas näkymä!");
        Button nappi3 = new Button("Ekaan näkymään!");
        kolmasAsettelu.add(teksti3, 0, 0);
        kolmasAsettelu.add(nappi3, 1,1);
        
        Scene kolmas = new Scene(kolmasAsettelu);
        
        nappi1.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });
        
        nappi2.setOnAction((event) -> {
            ikkuna.setScene(kolmas);
        });
        
        nappi3.setOnAction((event) -> {
            ikkuna.setScene(eka);
        });
        
        ikkuna.setScene(eka);
        ikkuna.show();
    }

}
