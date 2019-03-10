import java.util.Set;
import java.util.HashSet;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Set<String> nimet = new HashSet<>();
        nimet.add("eka");
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("toka");
        nimet.add("toka");
    }
    
    public static int palautaKoko(Set<String> nimet){
        return nimet.size();
    }

}
