
import java.util.ArrayList;

/**
 *
 * @author sonja
 */
public class Putki<T> {
    ArrayList<T> putki;
    
    public Putki(){
        this.putki = new ArrayList<>();
    }
    public void lisaaPutkeen(T arvo){
        putki.add(arvo);
    }
    public T otaPutkesta(){
        if (putki.isEmpty()){
            return null;
        }
        T palautus = this.putki.get(0);
        this.putki.remove(0);
        return palautus;
    }
    public boolean onkoPutkessa(){
        return !putki.isEmpty();
    }
}
