package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];
        
        int x = 0;        
        while (x < this.taulukko.length){
            
            int y = 0;            
            while (y < this.taulukko[0].length){
                
                if (this.taulukko[x][y] == 1 && (elossaOleviaNaapureita(this.taulukko, x, y) < 2) || 
                        elossaOleviaNaapureita(kopio, x, y) > 3){
                    kopio[x][y] = 0; // ali- tai ylikansoitus -> kuolema
                    
                } 
                if (this.taulukko[x][y] == 1 && 
                        (elossaOleviaNaapureita(this.taulukko, x, y) == 2 || 
                        elossaOleviaNaapureita(this.taulukko, x, y) == 3)){
                    kopio[x][y] = 1; // jää henkiin                    
                } 
                
                if (this.taulukko[x][y] == 0 && elossaOleviaNaapureita(this.taulukko, x, y) == 3){
                    kopio[x][y] = 1; // uudelleensyntymä
                } 
                y++;
            }
            x++;
        }
        this.taulukko = kopio;

    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int elossaOleviaNaapureita = 0;        
        int xMin = 0;
        int xMax = taulukko.length - 1;
        int yMin = 0; 
        int yMax = taulukko[0].length - 1;
        
        if (x-1 > 0){
            xMin = x-1;
        }
        
        if (x+1 < taulukko.length - 1){
            xMax = x+1;
        }
        
        if (y-1 > 0){
            yMin = y-1;
        }
        
        if (y+1 < taulukko[0].length - 1){
            yMax = y+1;
        }
        
        int i = xMin;
        while (i <= xMax){
            
            int j = yMin;
            while (j <= yMax){
                
                if (!(i == x && j == y) && taulukko[i][j] == 1){
                    elossaOleviaNaapureita++;
                }                
                j++;
            }
            i++;
        }
        
        return elossaOleviaNaapureita;
    }
}
