
public class Main {

    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa
        Laatikko laatikko = new Laatikko(10);
        Laatikko laatikko2 = new Laatikko(15);
        Laatikko isolaatikko = new Laatikko(25);

        laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2)) ;
        laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));

        laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

        
        laatikko2.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2)) ;
        laatikko2.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        laatikko2.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));
        
        System.out.println(laatikko);
        System.out.println(laatikko2);
        isolaatikko.lisaa(laatikko);
        isolaatikko.lisaa(laatikko2);
        System.out.println(isolaatikko);
        laatikko2.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2)) ;
        System.out.println(isolaatikko);
    }

}
