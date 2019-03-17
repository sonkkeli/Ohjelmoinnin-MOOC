package maatila;

import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.ceil;

public class Lehma implements Lypsava, Eleleva {
    private String nimi;
    private double utareet;
    private double maara;
    
    public Lehma(){
        this.nimi = nimiarvonta();
        this.utareet = utarebingo();
        this.maara = 0;
    }
    
    public Lehma(String nimi){
        this.nimi = nimi;
        this.utareet = utarebingo();
    }
    public String getNimi(){
        return this.nimi;
    }
    public double getTilavuus(){
        return this.utareet;
    }
    
    public double getMaara(){
        return this.maara;
    }
    
    @Override
    public double lypsa(){
        double lypsetty = this.maara;
        this.maara = 0;
        return lypsetty;
    }
    
    public void eleleTunti(){
        Random random = new Random();
        double luku = 0.7 + random.nextDouble() * 1.3;
        if (this.maara + luku < this.utareet){
            this.maara += luku;
        } else {
            this.maara = this.utareet;
        }        
    }
    
    public double utarebingo(){
        Random random = new Random();
        double luku = 15 + random.nextInt(26);
        return luku;
    }
    
    public String nimiarvonta(){
        Random random = new Random();
        int luku = random.nextInt(NIMIA.length);
        ArrayList<String> nimet = new ArrayList<>();
        for (String haku : NIMIA){
            nimet.add(haku);            
        }
        return nimet.get(luku);
    }

    @Override
    public String toString() {
        return this.nimi + " " + ceil(this.maara) + "/" + ceil(this.utareet);
    }
    
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
}
