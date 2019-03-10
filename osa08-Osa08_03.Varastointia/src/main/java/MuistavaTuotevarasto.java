
import java.util.ArrayList;

public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo){
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
    }
    
    public String historia(){
        return ""+ this.muutoshistoria;
    }
    
    @Override
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        this.muutoshistoria.lisaa(this.getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara){
        double otetut = super.otaVarastosta(maara);
        this.muutoshistoria.lisaa(this.getSaldo());
        return otetut;
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + this.muutoshistoria.toString());
        System.out.println("Suurin tuotemäärä: " + this.muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + this.muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + this.muutoshistoria.keskiarvo());
        System.out.println("Suurin muutos: " + this.muutoshistoria.suurinMuutos());
        System.out.println("Varianssi: " + this.muutoshistoria.varianssi());
    }
}
