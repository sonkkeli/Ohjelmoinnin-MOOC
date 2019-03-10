
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> syotteet = new ArrayList<>();
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("")){
                break;
            }
            syotteet.add(syote);
        }
        
        syotteet.stream()
                .forEach(syote -> System.out.println(syote));

    }
}
