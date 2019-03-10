
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> syotteet = new ArrayList<>();
        while(true){
            String syote = lukija.nextLine();
            if (syote.equals("loppu")){
                break;
            }
            syotteet.add(Integer.valueOf(syote));
        }
        
        double keskiarvo = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
    }
}
