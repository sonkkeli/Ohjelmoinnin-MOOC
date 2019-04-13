package sovellus;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {
    
    @Override
    public void start (Stage ikkuna){
        
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis(0,30,5);

        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Osuus(%)");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");
        
        int rivilaskuri = 0;
        ArrayList<Integer> vuodet = new ArrayList<>();
        
        try (Scanner tiedostonLukija = new Scanner(new File("puoluedata.tsv"))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split("\t");
                String[] palatMiinusTunniste = new String[palat.length -1];
                for (int i = 1 ; i < palat.length; i++){
                    palatMiinusTunniste[i-1] = palat[i];
                }
                for (int i = 0; i < palatMiinusTunniste.length; i++){
                    System.out.println(palatMiinusTunniste[i]);
                }
                String tunniste = palat[0];

                if (rivilaskuri == 0){
                    for (String vuosi : palatMiinusTunniste){
                        vuodet.add(Integer.parseInt(vuosi));
                    }
                    
                } else {
                    XYChart.Series kannatus = new XYChart.Series();
                    kannatus.setName(tunniste);

                    int i = 0;                    
                    for (String luku : palatMiinusTunniste){

                        if(! luku.equals("-")){
                            kannatus.getData().add(new XYChart.Data(vuodet.get(i), Double.parseDouble(luku)));
                        }                        
                        i++;
                    }
                    System.out.println(kannatus);
                    viivakaavio.getData().add(kannatus);
                }

                rivilaskuri++;
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();        
    }

    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }
}
