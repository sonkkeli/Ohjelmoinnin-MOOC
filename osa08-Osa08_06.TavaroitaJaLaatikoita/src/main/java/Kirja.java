
public class Kirja implements Talletettava{
    private String kirjailija;
    private String kirjanNimi;
    private double paino;
    
    public Kirja (String kirjailija, String kirjanNimi, double paino){
        this.kirjailija = kirjailija;
        this.kirjanNimi = kirjanNimi;
        this.paino = paino;
        
    }
    public String getNimi(){
        return this.kirjanNimi;
    }
    
    public double paino(){
        return this.paino;
    }

    @Override
    public String toString() {
        return kirjailija + ": " + kirjanNimi;
    }
    
    
}
