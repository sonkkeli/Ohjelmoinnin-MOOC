
public class LukutaitoOlio implements Comparable<LukutaitoOlio>{
    private String maa;
    private int vuosi;
    private String sukupuoli;
    private double lukutaitoprosentti;
    
    public LukutaitoOlio(String sukupuoli, String maa, int vuosi, double lukutaitoprosentti){
        this.maa = maa;
        this.vuosi = vuosi;
        String[] palat = sukupuoli.split(" ");
        this.sukupuoli = palat[0];
        this.lukutaitoprosentti = lukutaitoprosentti;
    }
    
    public double getLukutaitoprosentti(){
        return this.lukutaitoprosentti;
    }

    @Override
    public String toString() {
        return this.maa + " (" + this.vuosi + "), " + this.sukupuoli + ", " + this.lukutaitoprosentti;
    }

    @Override
    public int compareTo(LukutaitoOlio o) {        
        if (this.lukutaitoprosentti > o.getLukutaitoprosentti()){
            return 1;
        }        
        if (this.lukutaitoprosentti == o.getLukutaitoprosentti()){
            return 0;
        }        
        return -1;
    }
}