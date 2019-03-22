
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int rivit = 2;
        int sarakkeet = 3;
        int[][] matriisi = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(taulukkoMerkkijonona(matriisi));
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko){
        StringBuilder luvut = new StringBuilder();
        
        for (int rivi = 0; rivi < taulukko.length; rivi++) {
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
                int arvo = taulukko[rivi][sarake];
                luvut.append(arvo);
            }
            luvut.append("\n");
        }
        return luvut.toString();
    }

}
