/**
 *
 * @author sonja
 */
public class Pelaaja {
    private String nimi;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }    
        
    public void pelaa (){
        System.out.println("Pelataan");
    }
    
    public void tulostaNimi(){
        System.out.println(this.nimi);
    }
}
