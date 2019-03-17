
/**
 *
 * @author sonja
 */
public class Henkilo implements Tallennettava{
    private String nimi;
    private String osoite;

    @Override
    public void tallenna() {
        System.out.println("tallennettu");
    }

    @Override
    public void poista() {
        System.out.println("poistettu");
    }

    @Override
    public void lataa(String osoite) {
        System.out.println("ladattu");
    }
    
    
}
