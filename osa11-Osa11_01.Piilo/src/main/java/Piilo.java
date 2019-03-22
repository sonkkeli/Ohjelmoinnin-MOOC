
/**
 *
 * @author sonja
 */
public class Piilo<T> {
    T piilo;
    
    public Piilo(){
        
    }
    
    public void laitaPiiloon(T piilotettava){
        this.piilo = piilotettava;
    }
    public T otaPiilosta(){
        T palautus = this.piilo;
        this.piilo = null;
        return palautus;
    }
    
    public boolean onkoPiilossa(){
        if (piilo == null){
            return false;
        }
        return true;
    }
}
