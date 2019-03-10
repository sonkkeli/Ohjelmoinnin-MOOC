import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Varasto {
    
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;
    
    public Varasto(){
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        this.hinnat.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }
    
    public int hinta(String tuote){
        if (this.hinnat.containsKey(tuote)){
            return this.hinnat.get(tuote);
        } else {
            return -99;
        }
    }
    
    public int saldo(String tuote) {
        if (this.saldot.containsKey(tuote)){
            return this.saldot.get(tuote);
        } else {
            return 0;
        }
    }
    
    public boolean ota(String tuote) {
        if (saldo(tuote) > 0){
            this.saldot.replace(tuote, saldo(tuote)-1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> tuotteet() {
        Set<String> tuotelista = new HashSet<>();
        for (String tuote : this.hinnat.keySet()){
            tuotelista.add(tuote);
        }        
        return tuotelista;
    }
}
