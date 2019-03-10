
import java.util.Objects;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {

        this.nimi = nimi;
        if (paino >= 0){
            this.paino = paino;
        } else {
            throw new IllegalArgumentException("Paino ei voi olla negatiivinen.");
        }
        
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nimi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tavara other = (Tavara) obj;
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        return true;
    }

    
    
}
