

public class Opiskelija implements Comparable<Opiskelija> {

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }

    @Override
    public int compareTo(Opiskelija o) {
        if (this.nimi.equals(o.getNimi())){
            return 0;
        } else if (this.nimi.compareToIgnoreCase(o.getNimi()) > 0){
            return 1;
        } else {
            return -1;
        }
    }

}
