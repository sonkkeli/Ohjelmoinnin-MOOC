package maatila;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva {
    private String omistaja;
    private Navetta navetta;
    private ArrayList<Lehma> lehmat = new ArrayList<Lehma>();
    
    public Maatila (String omistaja, Navetta navetta){
        this.omistaja = omistaja;
        this.navetta = navetta;
        
    }
    public String getOmistaja(){
        return this.omistaja;
    }
    
    public void lisaaLehma(Lehma lehma){
        lehmat.add(lehma);
    }
    
    public void eleleTunti(){
        for (Lehma lehma : lehmat){
            lehma.eleleTunti();
        }
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti){
        navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    
    public void hoidaLehmat(){
        navetta.hoida(lehmat);
    }
    
    public void hoida(List<Lehma> lehmat){
        navetta.hoida(lehmat);
    }
    
    public String toString(){
        if (lehmat == null){
            return "Maatilan omistaja: "+ this.omistaja + "\nNavetan maitosäiliö: " + navetta.toString() + "\n" + "Ei lehmiä";
        } else {
            System.out.println("Maatilan omistaja: "+ this.omistaja);
            System.out.println("Navetan maitosäiliö: " + navetta.toString());
            System.out.println("Lehmät: ");
            for (Lehma lehma: lehmat){
                System.out.println("\t" + lehma);
            }
        }
        return "";
    }
    
}
