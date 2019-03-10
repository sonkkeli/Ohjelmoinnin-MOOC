
public class Sivari implements Palvelusvelvollinen {
    private int paivia;
    private int lusittu;
    
    public Sivari () {
        this.paivia = 362;
        this.lusittu = 0;
    }
    
    public int paiviaJaljella(){
        return this.paivia - lusittu;
    }
    
    public void palvele(){
        if (lusittu < paivia) {
            lusittu++; 
        }
               
    }
}
