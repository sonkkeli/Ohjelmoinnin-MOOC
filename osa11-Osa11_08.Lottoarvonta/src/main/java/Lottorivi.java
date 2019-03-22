
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {
    private Random random;
    private ArrayList<Integer> numerot;
    
    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.random = new Random();
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        int i = 0;
        int luku = 0;
        while (i < 7){
            luku = this.random.nextInt(40)+1;
            if (!(sisaltaaNumeron(luku))){
                this.numerot.add(luku);
                i++;
            }
        }
        
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        if (numerot.contains(numero)){
            return true;
        } else {
            return false;
        }       
    }
}
