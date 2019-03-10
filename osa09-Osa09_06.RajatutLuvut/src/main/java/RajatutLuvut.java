
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> syotteet = new ArrayList<>();
        while (true) {
            int syote = Integer.parseInt(lukija.nextLine());
            if (syote < 0){
                break;
            }
            syotteet.add(syote);
        }
        
        syotteet.stream()
                .filter(luku -> luku <= 5)
                .forEach(syote -> System.out.println(syote));
    }
}
