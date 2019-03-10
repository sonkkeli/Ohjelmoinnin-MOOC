
import java.util.ArrayList;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        Henkilo sonja = new Henkilo("Sonja", Koulutus.FM);
        Henkilo vilma = new Henkilo("Vilma", Koulutus.FT);
        henkilot.add(sonja);
        henkilot.add(vilma);
        
        Tyontekijat yliopisto = new Tyontekijat();
        yliopisto.lisaa(new Henkilo("Petrus", Koulutus.FT));
        yliopisto.lisaa(new Henkilo("Arto", Koulutus.FilYO));
        yliopisto.lisaa(new Henkilo("Elina", Koulutus.FT));
        yliopisto.lisaa(henkilot);

        yliopisto.tulosta();

        yliopisto.irtisano(Koulutus.FilYO);

        System.out.println("==");

        yliopisto.tulosta();
    }
}
