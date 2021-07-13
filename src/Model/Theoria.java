package Model;

/**
 *
 * @author papakon
 */
import java.util.*;
public class Theoria extends Mathima{
    private ArrayList<Theoria> proapaitoumeno=new ArrayList<>();
    
    public Theoria(String kwdikos, String titlos) {
        super(kwdikos, titlos);
    }
    public void addProapaitoumeno(Theoria m){
        proapaitoumeno.add(m);
    }

    public ArrayList<Theoria> getProapaitoumeno() {
        return proapaitoumeno;
    }
    
    

}
