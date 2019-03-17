package lentokentta;

import lentokentta.ui.Tekstikayttoliittyma;
import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;

public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Lentohallinta lentohallinta = new Lentohallinta();
        Scanner lukija = new Scanner(System.in);
        Tekstikayttoliittyma kayttis = new Tekstikayttoliittyma(lentohallinta, lukija);
        kayttis.kaynnista();
        
    }
}
