
public class CDLevy implements Talletettava{
    private String artisti;
    private String levynNimi;
    private int julkaisuvuosi;
    
    public CDLevy (String artisti, String levynNimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.levynNimi = levynNimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    
    public String getNimi(){
        return this.levynNimi;
    }
    
    public double paino(){
        return 0.1;
    }
    @Override
    public String toString() {
        return artisti + ": " + levynNimi + " (" + julkaisuvuosi + ")";
    }
}
