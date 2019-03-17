package sanakirja;

public class Main {
    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        
        MuistavaSanakirja sanakirja = new MuistavaSanakirja("sanat.txt");
        sanakirja.lataa();        
        sanakirja.lisaa("auto", "car");
        
        System.out.println("alussa " + sanakirja);
        sanakirja.poista("car");
        System.out.println("lopussa " + sanakirja);
        sanakirja.tallenna();
        sanakirja.lataa();
        System.out.println(sanakirja);
    }
}
