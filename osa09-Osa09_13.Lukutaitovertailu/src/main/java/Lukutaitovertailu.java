
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        List<LukutaitoOlio> oliot = lueOliot();
        oliot.stream().sorted( (o1,o2) -> {
            return o1.compareTo(o2);
        }).forEach(o -> System.out.println(o));       
    }
    
    public static List<LukutaitoOlio> lueOliot(){
        List<LukutaitoOlio> oliot = new ArrayList<>();
        try {
            Files.lines(Paths.get("lukutaito.csv"))
                .map(rivi -> rivi.split(","))
                .map(palat -> new LukutaitoOlio(palat[2].trim(), palat[3].trim(), Integer.valueOf(palat[4]), Double.valueOf(palat[5])))
                .forEach(olio -> oliot.add(olio));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
            System.out.println("täällä");
        }     
        return oliot;
    }
}
