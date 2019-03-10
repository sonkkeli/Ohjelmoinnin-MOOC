
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Integer> syotteet = new ArrayList<>();
        while(true){
            String syote = lukija.nextLine();
            if (syote.equals("loppu")){
                break;
            }
            syotteet.add(Integer.valueOf(syote));
        }
        System.out.println("Tulostetaanko negatiivisten "
                + "vai positiivisten lukujen keskiarvo? (n/p)");
        if (lukija.nextLine().equals("n")){
            double keskiarvoNeg = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku < 0)
                .average()
                .getAsDouble();
            System.out.println("Negatiivisten lukujen "
                    + "keskiarvo: " + keskiarvoNeg);
        } else {
            double keskiarvoPos = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku > 0)
                .average()
                .getAsDouble();
        
        System.out.println("Positiivisten lukujen "
                    + "keskiarvo: " + keskiarvoPos);
        }
    }
}
