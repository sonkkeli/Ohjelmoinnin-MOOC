
package sovellus;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori {
    private ArrayList<Sensori> sensorit;
    private List<Integer> mittaukset;
    
    public Keskiarvosensori(){
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }
    
    public List<Integer> mittaukset(){
        return this.mittaukset;
    }
    
    public void lisaaSensori(Sensori lisattava){
        sensorit.add(lisattava);
    }
    
    public boolean onPaalla(){
        // palauttaa true jos sensori on päällä
        for (Sensori sensori : sensorit){
            if (!sensori.onPaalla()){
                return false;
            }
        }
        return true;
    }
    public void paalle(){
        // käynnistä sensorin
        for (Sensori sensori : sensorit){
            sensori.paalle();
        }
    }

    public void poisPaalta(){
        // sulkee sensorin
        for (Sensori sensori : sensorit){
            sensori.poisPaalta();
        }
    }

    public int mittaa(){
        // palauttaa sensorin lukeman jos sensori on päällä
        // jos sensori ei päällä heittää poikkeuksen IllegalStateException
        int summa = 0;
        if (this.onPaalla() && sensorit.size() > 0){
            for (Sensori sensori : sensorit) {
                summa += sensori.mittaa();
            }
            this.mittaukset.add(summa / this.sensorit.size());
            return summa / this.sensorit.size();
            
        } else {
            throw new IllegalStateException("Kaikki sensorit eivät ole päällä");
        }
    }
}
