
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {
        /*
        Siamese method -algoritmi toimii siten, että numero 
        yksi asetetaan ylimmän rivin keskimmäiseen sarakkeeseen. 
        Tämän jälkeen siirrytään yksi ylös ja yksi oikealle ja 
        asetetaan luku kaksi. Tämän jälkeen taas siirrytään yksi 
        ylös ja yksi oikealle, ja asetetaan luku kolme jne.

        Lukujen lisäämiseen liittyy kaksi sääntöä:

        1) Jos siirtymä tapahtuu siten, että mennään taikaneliön alueen
        ulkopuolelle, hypätään toiselle laidalle. Jos siis mennään 
        "oikealta yli" mennään vasempaan laitaan ja jos mennään 
        "ylhäältä yli" mennään alalaitaan.
        
        2) Jos kohdassa on jo luku, ei mennäkään ylös ja oikealle, 
        vaan astutaan yksi askel alaspäin.
        */

        Taikanelio nelio = new Taikanelio(koko);
        
        // asetetaan alkupiste
        int pisteX = koko / 2;
        int pisteY = 0;
        int luku = 1;
        
        while (luku <= (koko * koko)){
            
            nelio.asetaArvo(pisteX, pisteY, luku);

            int kandidaattiY = pisteY - 1;
            int kandidaattiX = pisteX + 1;

            if (kandidaattiY < 0) {
                kandidaattiY += koko;
            }

            if (kandidaattiX >= koko) {
                kandidaattiX = 0;
            }

            if (nelio.annaArvo(kandidaattiX, kandidaattiY) == 0) {
                pisteX = kandidaattiX;
                pisteY = kandidaattiY;
            } else {
                pisteY++;
                if (pisteY >= koko) {
                    pisteY = 0;
                }
            }
//            int[] koordinaatit = seuraavakohde(pisteX, pisteY, nelio);
//            nelio.asetaArvo(koordinaatit[0], koordinaatit[1], luku);
//            System.out.println(koordinaatit[0] + " " +  koordinaatit[1] + " " + luku);
//            // otetaan talteen seuraavaa varten
//            pisteX = koordinaatit[0];
//            pisteY = koordinaatit[1];
            luku++;
        }
        return nelio;
    }
//    public int[] seuraavakohde(int x, int y, Taikanelio nelio){
//        int uusiX = x + 1 ;
//        int uusiY = y - 1 ;
//        
//        while (true){
//            if (uusiY < 0){
//                uusiY = nelio.getKorkeus() - 1;
//            } else if (uusiX >= nelio.getLeveys()) {
//                uusiX = 0; 
//            } else if (nelio.annaArvo(uusiX, uusiY) != 0){
//                uusiX = x;
//                uusiY = y + 1; 
//                
//            } else {
//                break;
//            }
//            //System.out.println("jumis");
//        }  
//
//        int[] koordinaatit = {uusiX, uusiY};
//        return koordinaatit;
//    }
}
