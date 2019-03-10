
import java.util.ArrayList;

public class Lauma implements Siirrettava{
    private ArrayList<Siirrettava> lauma;
    
    public Lauma(){
        this.lauma = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava){
        this.lauma.add(siirrettava);
    }
        
    public void siirra(int dx, int dy){
        for (Siirrettava siirrettava : this.lauma){
            siirrettava.siirra(dx, dy);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Siirrettava siirrettava : this.lauma){
            sb.append(siirrettava.toString()).append("\n");
        }
        return sb.toString();
    }
}
