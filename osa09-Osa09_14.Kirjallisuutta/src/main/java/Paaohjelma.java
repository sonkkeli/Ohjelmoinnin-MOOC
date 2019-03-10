
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        
        while (true){
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()){
                System.out.println("");
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.parseInt(lukija.nextLine());
            kirjat.add(new Kirja(nimi, ika));
            System.out.println("");
        }
        System.out.println("Yhteensä " + kirjat.size() + " kirjaa.\n");
        
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getIka)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, vertailija);
        
        System.out.println("Kirjat:");
        kirjat.stream().forEach(kirja -> System.out.println(kirja));
    }
}
