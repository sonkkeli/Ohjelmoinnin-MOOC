package maatila;

public class Lypsyrobotti {
    private Maitosailio maitosailio;
    
    public Lypsyrobotti(){
        this.maitosailio = null;
    }
    public Maitosailio getMaitosailio(){
        if (this.maitosailio != null){
            return this.maitosailio;
        } else {
            return null;
        }        
    }
    
    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }
    
    public void lypsa(Lypsava lypsava){
        if (getMaitosailio() != null){
            this.maitosailio.lisaaSailioon(lypsava.lypsa());
        } else {
            System.out.println("Maidot menevät hukkaan!");
        }
    }
}
