package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {
    private boolean virranTila;
    
    public Lampomittari(){
        this.virranTila = false;
    }
    
    public boolean onPaalla(){
        // palauttaa true jos sensori on päällä
        return this.virranTila;
    }
    public void paalle(){
        // käynnistä sensorin
        this.virranTila = true;
    }

    public void poisPaalta(){
        // sulkee sensorin
        this.virranTila = false;
    }

    public int mittaa(){
        // palauttaa sensorin lukeman jos sensori on päällä
        // jos sensori ei päällä heittää poikkeuksen IllegalStateException
        if (this.onPaalla() == false){
            throw new IllegalStateException();
        }        
        Random random = new Random();
        return random.nextInt(61) - 30;
    }
}
