package maatila;

import java.lang.IllegalStateException;
import java.util.List;

public class Navetta {
    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;
    
    public Navetta (Maitosailio maitosailio){
        this.maitosailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio(){
        return this.maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        lypsyrobotti.setMaitosailio(this.maitosailio);
        this.lypsyrobotti = lypsyrobotti;
    }
    
    public void hoida(Lehma lehma){
        if (lypsyrobotti == null){
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
            
        } 
        lypsyrobotti.lypsa(lehma);
               
    }
    public void hoida(List<Lehma> lehmat) {
        for (Lehma lehma : lehmat){
            hoida(lehma);
        }
    }
    public String toString(){
        return maitosailio.toString();
    }
}
