
import java.util.ArrayList;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Muutoshistoria {
    private ArrayList<Double> muutoshistoria;
    
    public Muutoshistoria (){
        this.muutoshistoria = new ArrayList<>();
    }
    
    public void lisaa(double tilanne){
        this.muutoshistoria.add(tilanne);
    }
    
    public void nollaa(){
        this.muutoshistoria.removeAll(muutoshistoria);
    }
    
    public double maxArvo(){
        double maxArvo = muutoshistoria.get(0);
        for (Double arvo : muutoshistoria){
            if (arvo > maxArvo){
                maxArvo = arvo;
            }
        }
        return maxArvo;
    }
    
    public double minArvo(){
        double minArvo = muutoshistoria.get(0);
        for (double arvo : muutoshistoria){
            if (arvo < minArvo){
                minArvo = arvo;
            }
        }
        return minArvo;
    }
    
    public double keskiarvo(){
        double summa = 0;
        for (double arvo: muutoshistoria){
            summa += arvo;
        }
        return summa / muutoshistoria.size();
    }
    
    public double suurinMuutos(){
        if (muutoshistoria.size() <= 1){
            return 0;
        }
        int i = 0;
        double suurinMuutos = 0;
        while (i < muutoshistoria.size()-1){
            if (abs(muutoshistoria.get(i)-muutoshistoria.get(i+1)) > suurinMuutos){
                suurinMuutos = abs(muutoshistoria.get(i)-muutoshistoria.get(i+1));
            }
            i++;
        }
        return suurinMuutos;
    }
    
    public double varianssi(){
        if (muutoshistoria.size() <= 1){
            return 0;
        }
        double varianssi = 0;
        for (double arvo : muutoshistoria){
            varianssi += pow((arvo - this.keskiarvo()),2);
        }
        varianssi = varianssi / (muutoshistoria.size()-1);
        return varianssi;
    }
    
    @Override
    public String toString(){
        return "" + this.muutoshistoria;
    }    
}
