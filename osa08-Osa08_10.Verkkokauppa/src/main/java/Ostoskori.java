import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Ostoskori {
    private Map<String, Ostos> ostoskori;
    
    public Ostoskori(){
        this.ostoskori = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta){
        // lisää ostoskoriin ostoksen
        if (!this.ostoskori.containsKey(tuote)){
            Ostos ostos = new Ostos(tuote, 1, hinta);
            this.ostoskori.put(tuote, ostos);
            
        } else {
            this.ostoskori.get(tuote).kasvataMaaraa();            
        }
    }
    
    public int hinta(){
        // palauttaa ostoskorin kokonaishinnan
        int kokonaishinta = 0;
        
        for (String tuote : this.ostoskori.keySet()){
            kokonaishinta += this.ostoskori.get(tuote).hinta();
        }
        return kokonaishinta;
    }
    
    public void tulosta(){
        for (String tuote : this.ostoskori.keySet()){
            System.out.println(this.ostoskori.get(tuote));
        }
    }
}
