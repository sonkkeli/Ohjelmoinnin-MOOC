package schelling;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private Taulukko taulukko;

    private double prosAlueestaKaytossa;
    private int tyytyvaisyysraja;
    private int ryhmienLukumaara;

    private boolean kaynnissa;

    public Eriytymismalli(int leveys, int korkeus, int tyytyvaisyysraja, int ryhmienLukumaara, double prosAlueestaKaytossa) {
        this.taulukko = new Taulukko(leveys, korkeus);

        this.tyytyvaisyysraja = tyytyvaisyysraja;
        this.ryhmienLukumaara = ryhmienLukumaara;
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;

        this.kaynnissa = false;
    }

    public void kaynnista() {
        this.kaynnissa = true;
    }

    public void sammuta() {
        this.kaynnissa = false;
    }

    public boolean onKaynnissa() {
        return this.kaynnissa;
    }

    public void asetaRyhmienLukumaara(int ryhmia) {
        this.ryhmienLukumaara = ryhmia;
    }

    public void asetaProsAlueestaKaytossa(double prosAlueestaKaytossa) {
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;
    }

    public void asetaTyytyvaisyysRaja(int tyytyvaisyysraja) {
        this.tyytyvaisyysraja = tyytyvaisyysraja;

    }

    public void alusta() {
        arvoAlkuarvot();
    }

    public void arvoAlkuarvot() {
        Random arpoja = new Random();

        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {
                
                double satunnainenLukuNollanJaYhdenValilla = arpoja.nextDouble();

                if (100 * satunnainenLukuNollanJaYhdenValilla < prosAlueestaKaytossa) {
                    int ryhma = 1 + arpoja.nextInt(ryhmienLukumaara);
                    this.taulukko.aseta(x, y, ryhma);
                }
            }
        }
    }

    public Taulukko getData() {
        return this.taulukko;
    }

    public void setData(Taulukko taulukko) {
        this.taulukko = taulukko;
    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        // Luo täällä lista, missä on kaikki tyhjät paikat piste-olioina.
        // Tyhjissä paikoissa on arvo 0
        int x = 0;        
        while (x < this.taulukko.getLeveys()){
            
            int y = 0;
            while (y < this.taulukko.getKorkeus()){
                if (this.taulukko.hae(x, y) == 0){
                    Piste p = new Piste(x,y);
                    tyhjat.add(p);
                }
                y++;
            }
            x++;
        }
        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            int tyytymattomanRyhma = this.taulukko.hae(tyytymaton.getX(), tyytymaton.getY());

            this.taulukko.aseta(tyhja.getX(), tyhja.getY(), tyytymattomanRyhma);
            this.taulukko.aseta(tyytymaton.getX(), tyytymaton.getY(), 0);
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        
        int x = 0;        
        while (x < this.taulukko.getLeveys()){
            
            int y = 0;
            while (y < this.taulukko.getKorkeus()){
                
                int samanhenkiset = 0;
                
                if (this.taulukko.hae(x-1, y-1) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x, y-1) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x+1, y-1) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x-1, y) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x+1, y) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x-1, y+1) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x, y+1) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                if (taulukko.hae(x+1, y+1) == this.taulukko.hae(x,y)){
                    samanhenkiset++;
                }
                
                if (samanhenkiset < tyytyvaisyysraja){
                    tyytymattomat.add(new Piste(x,y));
                }
                y++;
            }
            x++;
        }
        return tyytymattomat;
    }
}
