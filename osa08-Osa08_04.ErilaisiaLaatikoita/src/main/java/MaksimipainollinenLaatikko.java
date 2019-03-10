
import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino){        
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        int kokonaispaino = 0;
        for (Tavara keke : this.tavarat){
            kokonaispaino += keke.getPaino();            
        }
        if (tavara.getPaino() <= this.maksimipaino - kokonaispaino){
            this.tavarat.add(tavara);            
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara etsittava : this.tavarat){
            if (etsittava.equals(tavara)){
                return true;
            }
        }
        return false;
    }
}
