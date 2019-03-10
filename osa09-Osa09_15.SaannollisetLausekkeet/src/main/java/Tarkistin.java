

public class Tarkistin {

    
    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")){
            return true;
        }
        return false;
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("[aeiouyåäö]*")){
            return true;
        }
        return false;
    }
    
    public boolean kellonaika(String merkkijono) {
        return merkkijono.matches(
                "([01][0123456789]|2[0123]):"
                        + "[012345][0123456789]:"
                        + "[012345][0123456789]");
    }
    
    public boolean kellonaikaIlmanSäännöllisiäLausekkeita(String merkkijono) {
        try {
            String[] palat = merkkijono.split(":");
            for (String pala : palat){
                if (pala.length()<2){
                    return false;
                }
            }
            int tt = Integer.valueOf(palat[0]);
            int mm = Integer.valueOf(palat[1]);
            int ss = Integer.valueOf(palat[2]);
            if ((tt >= 0 && tt < 24) && 
                    (mm >= 0 && mm < 60) && 
                    (ss >= 0 && ss < 60) ){
                return true;
            }
        } catch (Exception e){
            return false;
        }
        return false;
    }
}
