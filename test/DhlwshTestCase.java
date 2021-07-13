/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static Control.Lcon.result;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Model.*;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author papakon
 */
public class DhlwshTestCase {
    
    public DhlwshTestCase() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test(){
        /*Foithths test =new Foithths(1, "test", "test");
        Ergasthrio testMath=new Ergasthrio("111", "TestMath");
        Dhlwsh testDhl=new Dhlwsh("11/1/11", testMath);
        boolean flag=test.addDhlwsh(testDhl);
        System.out.println(flag);
        assertEquals(flag, false);//den exei perasei to theoritiko meros oute to exei dhlwsei opote prepei na einai false*/
        boolean flag;
  
        ArrayList<Foithths>foithtes=new ArrayList<>();
        flag=foithtes.add(new Foithths(151234, "Αθανασίου", "Κίμων"));
        assertEquals(flag, true);
        flag=foithtes.add(new Foithths(163217, "Βασιλειάδου", "Ανδρομάχη"));
        assertEquals(flag, true);
        flag=foithtes.add(new Foithths(172278, "Γεωργίου", "Αλκης"));
        assertEquals(flag, true);
        
        System.out.println("\n");
        ArrayList<Mathima>mathimata=new ArrayList<>();
        flag=mathimata.add(new Theoria("1205-Θ", "Αντικειμενοστρεφής Προγραμματισμός (Θ)"));
        assertEquals(flag, true);
        flag=mathimata.add(new Ergasthrio("1205-Ε", "Αντικειμενοστρεφής Προγραμματισμός (Ε)"));
        assertEquals(flag, true);
        flag=mathimata.add(new Theoria("1305-Θ", "Δομές Δεδομένων και Ανάλυση Αλγορίθμων")) ;
        assertEquals(flag, true);
        flag=mathimata.add(new Theoria("1742-Θ", "Μηχανική Λογισμικού"));
        assertEquals(flag, true);
        
        ((Theoria) mathimata.get(2)).addProapaitoumeno((Theoria) mathimata.get(0));
        ((Theoria) mathimata.get(3)).addProapaitoumeno((Theoria) mathimata.get(0));
        ((Theoria) mathimata.get(3)).addProapaitoumeno((Theoria) mathimata.get(2));
        
        
        flag=foithtes.get(0).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(0)));
        assertEquals(flag, true);
        foithtes.get(0).getDhlwsh().get(0).addVathmo("17/5/2019",8.0);
        flag=foithtes.get(0).addDhlwsh(new Dhlwsh("25/9/2019",mathimata.get(2)));
        assertEquals(flag, true);
        flag=foithtes.get(0).addDhlwsh(new Dhlwsh("26/9/2019",mathimata.get(3)));
        assertEquals(flag, false);
        
        flag=foithtes.get(1).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(1)));
        assertEquals(flag, false);
        flag=foithtes.get(1).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(2)));
        assertEquals(flag, false);
        flag=foithtes.get(1).addDhlwsh(new Dhlwsh("20/2/2019",mathimata.get(3)));
        assertEquals(flag, false);
        
        flag=foithtes.get(2).addDhlwsh(new Dhlwsh("22/2/2019",mathimata.get(0)));
        assertEquals(flag, true);
        foithtes.get(2).getDhlwsh().get(0).addVathmo("17/5/2019",7.0);
        flag=foithtes.get(2).addDhlwsh(new Dhlwsh("20/9/2019",mathimata.get(2)));
        assertEquals(flag, true);
        foithtes.get(2).getDhlwsh().get(0).addVathmo("21/9/2019",4.0);
        flag=foithtes.get(2).addDhlwsh(new Dhlwsh("28/9/2019",mathimata.get(3)));
        assertEquals(flag, false);
        
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
