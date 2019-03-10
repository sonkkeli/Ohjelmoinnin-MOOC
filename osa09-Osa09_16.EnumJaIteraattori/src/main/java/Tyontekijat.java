
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sonja
 */
public class Tyontekijat {
    private ArrayList<Henkilo> tyontekijat;
    
    public Tyontekijat(){
        this.tyontekijat = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava){
        this.tyontekijat.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat){
        lisattavat.stream().forEach(henkilo -> this.tyontekijat.add(henkilo));
    }
    public void tulosta(){
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()){
            System.out.println(iteraattori.next());
        }
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()){
            Henkilo hlo = iteraattori.next();
            if (hlo.getKoulutus().equals(koulutus)){
                System.out.println(hlo);
            }            
        }
    }
    
    public void irtisano(Koulutus koulutus){
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()){
            Henkilo hlo = iteraattori.next();
            if (hlo.getKoulutus().equals(koulutus)){
                iteraattori.remove();
            }            
        }
    }
}
