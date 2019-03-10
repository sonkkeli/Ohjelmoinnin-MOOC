
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja  
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        Tarkistin tark = new Tarkistin();
        if (tark.kellonaika(lukija.nextLine())){
            System.out.println("Muoto on oikea.");
        } else {
            System.out.println("Muoto ei ole oikea.");
        }        
    }
}
