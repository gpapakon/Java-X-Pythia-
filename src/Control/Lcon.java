package Control;

/**
 *
 * @author papakon
 */
import java.util.*;
import Model.*;
public class Lcon {
    public static void main(String[] args) {
        ArrayList<Foithths>foithtes=new ArrayList<>();
        foithtes.add(new Foithths(151234, "Αθανασίου", "Κίμων"));
        foithtes.add(new Foithths(163217, "Βασιλειάδου", "Ανδρομάχη"));
        foithtes.add(new Foithths(172278, "Γεωργίου", "Αλκης"));
        System.out.println(foithtes.toString());
        
        ArrayList<Mathima>mathimata=new ArrayList<>();
        mathimata.add(new Theoria("1205-Θ", "Αντικειμενοστρεφής Προγραμματισμός (Θ)"));
        mathimata.add(new Ergasthrio("1205-Ε", "Αντικειμενοστρεφής Προγραμματισμός (Ε)"));
        mathimata.add(new Theoria("1305-Θ", "Δομές Δεδομένων και Ανάλυση Αλγορίθμων")) ;
        mathimata.add(new Theoria("1742-Θ", "Μηχανική Λογισμικού"));
        
        ((Theoria) mathimata.get(2)).addProapaitoumeno((Theoria) mathimata.get(0));
        ((Theoria) mathimata.get(3)).addProapaitoumeno((Theoria) mathimata.get(0));
        ((Theoria) mathimata.get(3)).addProapaitoumeno((Theoria) mathimata.get(2));
        
        
        
        result(foithtes.get(0).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(0))));
        foithtes.get(0).getDhlwsh().get(0).addVathmo("17/5/2019",8.0);
        result(foithtes.get(0).addDhlwsh(new Dhlwsh("25/9/2019",mathimata.get(2))));
        result(foithtes.get(0).addDhlwsh(new Dhlwsh("26/9/2019",mathimata.get(3))));
        System.out.println("\n");
        
        result(foithtes.get(1).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(1))));
        result(foithtes.get(1).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(2))));
        result(foithtes.get(1).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(3))));
        System.out.println("\n");
        
        result(foithtes.get(2).addDhlwsh(new Dhlwsh("22/2/2019",mathimata.get(0))));
        foithtes.get(2).getDhlwsh().get(0).addVathmo("17/5/2019",7.0);
        result(foithtes.get(2).addDhlwsh(new Dhlwsh("20/9/2019",mathimata.get(2))));
        foithtes.get(2).getDhlwsh().get(0).addVathmo("21/9/2019",4.0);
        result(foithtes.get(2).addDhlwsh(new Dhlwsh("28/9/2019",mathimata.get(3))));
        for(int i=0;i<foithtes.size();i++){
            System.out.println(foithtes.get(i).toString());
        }
    }
    public static void result(boolean flag){
        if(flag){
            System.out.println("Επιτυχής");
        }else{
            System.out.println("Μη επιτυχής");
        }
    }
  
}
