package sovellus;


public class Vakiosensori implements Sensori{
    private int mittaus;
    
    public Vakiosensori(int mittaus){
        this.mittaus = mittaus;
    }
    
    public boolean onPaalla(){
        // palauttaa true jos sensori on päällä
        return true;
    }
    public void paalle(){
        // käynnistä sensorin
    }

    public void poisPaalta(){
        // sulkee sensorin
    }

    public int mittaa(){
        // palauttaa sensorin lukeman jos sensori on päällä
        // jos sensori ei päällä heittää poikkeuksen IllegalStateException
        return this.mittaus;
    }
    
}
