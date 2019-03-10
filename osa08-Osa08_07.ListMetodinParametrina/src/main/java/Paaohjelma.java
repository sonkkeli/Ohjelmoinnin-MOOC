import java.util.List;
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        List<String> nimet = new ArrayList<>();
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("kolmas");

        // System.out.println(new ListanTarkistin().palautaKoko(nimet));

    }
    
    public static int palautaKoko(List<String> list){
        return list.size();
    }

}
