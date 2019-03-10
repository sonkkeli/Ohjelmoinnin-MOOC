
public class Kirja {
    private String nimi;
    private int ika;
    
    public Kirja(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getIka(){
        return this.ika;
    }
    
    @Override
    public String toString(){
        return this.nimi + "(" + this.ika + " vuotiaille ja vanhemmille)";
    }
}
