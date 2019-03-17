
package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author sonja
 */
public class MuistavaSanakirja {
    private HashMap<String, String> sanakirja;
    private String tiedosto;
    
    public MuistavaSanakirja(){
        this.sanakirja = new HashMap<>();
    }
    
    public MuistavaSanakirja(String tiedosto){
        this.sanakirja = new HashMap<>();
        this.tiedosto = tiedosto;
    }
    
    public void lisaa(String sana, String kaannos){
        if (!this.sanakirja.containsKey(sana)){
            this.sanakirja.put(sana, kaannos);
        }        
    }
    
    public String kaanna(String sana){
        String kaannos = null;
        
        if (this.sanakirja.containsKey(sana)){
            kaannos = this.sanakirja.get(sana);
        } else {
            for (String avain : this.sanakirja.keySet()){
                if (this.sanakirja.get(avain).equals(sana)){
                    kaannos = avain;
                }
            }            
        } 
        return kaannos;
    }
    
    public void poista(String sana){
        if (this.sanakirja.containsKey(sana)){
            this.sanakirja.remove(sana);
        } else {
            Iterator<String> iteraattori = this.sanakirja.values().iterator();
            while (iteraattori.hasNext()){
                if (iteraattori.next().equals(sana)){
                    iteraattori.remove();
                }
            }
        }
    }
    
    public boolean lataa(){
        boolean onnistuminen = false;
        try(Scanner tiedostonLukija = new Scanner(new File(tiedosto))){
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                lisaa(osat[0],osat[1]);
            }
            onnistuminen = true;
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return onnistuminen;
    }
    
    public boolean tallenna(){
        boolean onnistuminen = false;
        
        FileWriter fw = null;
        try {            
            fw = new FileWriter(tiedosto);
            for (String sana : this.sanakirja.keySet()){
                fw.write(sana + ":" + this.sanakirja.get(sana) + "\n");
            }
            onnistuminen = true;
//            System.out.println("valmista tuli");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());            
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return onnistuminen;
    }

    @Override
    public String toString() {
        return "MuistavaSanakirja: " + sanakirja;
    }
}
