import java.util.ArrayList;
import java.util.Objects;

public class Laatikko implements Talletettava {
    private double maksimipaino;
    private ArrayList<Talletettava> painot;
    
    public Laatikko (double maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.painot = new ArrayList<>();
        
    }
    public void lisaa(Talletettava talletettava){
        if (paino() + talletettava.paino() <= this.maksimipaino){
            this.painot.add(talletettava);
        }
        
    }
    @Override
    public double paino(){
        double paino = 0;
        int i = 0;
        while (i < painot.size()) {
            paino += painot.get(i).paino();
            i++;
        }
        return paino;
    }

    @Override
    public String toString() {
        return "Laatikko: " + painot.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.maksimipaino) ^ (Double.doubleToLongBits(this.maksimipaino) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.painot);
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
        final Laatikko other = (Laatikko) obj;
        if (Double.doubleToLongBits(this.maksimipaino) != Double.doubleToLongBits(other.maksimipaino)) {
            return false;
        }
        if (!Objects.equals(this.painot, other.painot)) {
            return false;
        }
        return true;
    }
    
}
