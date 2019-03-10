import java.util.ArrayList;
import java.util.Collections;
/**
 * @author sonja
 */
public class Kasi implements Comparable<Kasi> {
    private ArrayList<Kortti> kortit;
    
    public Kasi (){
        this.kortit = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti){
        this.kortit.add(kortti);
    }
    
    public void tulosta(){
        this.kortit.stream().forEach(kortti -> System.out.println(kortti));
    }
    
    public void jarjesta(){
        Collections.sort(this.kortit);
    }
    
    public void jarjestaMaittain(){
        SamatMaatVierekkainArvojarjestykseen jarjestaja = new SamatMaatVierekkainArvojarjestykseen();
        Collections.sort(this.kortit, jarjestaja);
    }
    
    private int summa(){
        return this.kortit.stream()
                .mapToInt(kortti -> kortti.getArvo())
                .reduce(0, (edlSumma, arvo) -> edlSumma + arvo);
    }

    @Override
    public int compareTo(Kasi o) {
        return this.summa() - o.summa();
    }
}
