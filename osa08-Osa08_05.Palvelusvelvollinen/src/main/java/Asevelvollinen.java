
public class Asevelvollinen implements Palvelusvelvollinen {
    private int paivia;
    int lusittu;
    
    public Asevelvollinen (int paivia){
        this.paivia = paivia;
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
