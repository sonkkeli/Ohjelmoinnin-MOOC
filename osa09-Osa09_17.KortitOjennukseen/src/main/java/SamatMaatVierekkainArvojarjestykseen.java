
import java.util.Comparator;

/**
 * @author sonja
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    @Override
    public int compare(Kortti o1, Kortti o2) {
        if (o1.getMaa().ordinal() == o2.getMaa().ordinal()){
            return o1.getArvo() - o2.getArvo();
        } else {
            return o1.getMaa().ordinal() - o2.getMaa().ordinal();
        }        
    }    
}
