
package maatila;

import static java.lang.Math.ceil;

public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio(){
        this.tilavuus = 2000;
        this.saldo = 0;
    }
    public Maitosailio(double tilavuus){
        this.tilavuus = tilavuus;
        this.saldo = 0;
    }
    public double getTilavuus(){
        return this.tilavuus;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public double paljonkoTilaaJaljella(){
        return this.tilavuus - this.saldo;
    }
    public void lisaaSailioon(double maara){
        if (maara <= this.paljonkoTilaaJaljella()){
            this.saldo += maara;
        } else {
            this.saldo = this.tilavuus;
        }
    }
    public double otaSailiosta(double maara){
        if (this.getSaldo() >= maara){
            return this.saldo -= maara;
        } else {
            return this.saldo = 0;
        }
    }
    

    @Override
    public String toString() {
        return ceil(this.saldo) +"/"+ ceil(this.tilavuus);
    }
    
    
}
