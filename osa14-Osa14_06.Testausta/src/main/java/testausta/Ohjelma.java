package testausta;

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // System.out.println(suorita(lukija));
        System.out.println(Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")));
    }

    public static String suorita(Scanner lukija) {
        int pulloja = 0;
        int oppilaita = 0;
        
        while (true){
            int lkm = Integer.parseInt(lukija.nextLine());
            if ( lkm == -1 ){
                break;
            }
            if (lkm >= 0){
                pulloja += lkm;
                oppilaita++;
            }            
        }
        
        String keskiarvo = "";
        if (oppilaita > 0){
            keskiarvo = "Keskiarvo: " + ((double) pulloja / oppilaita);
        } else {
            keskiarvo = "Keskiarvoa ei voida laskea";
        }
        
        return "Pulloja: " + pulloja + "\nOppilaita: " + oppilaita + "\n" + keskiarvo;
    }
}
