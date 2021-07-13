package Model;

/**
 *
 * @author papakon
 */
public abstract class Mathima {
    private String kwdikos;
    private String titlos;

    public Mathima(String kwdikos, String titlos) {
        this.kwdikos = kwdikos;
        this.titlos = titlos;
    }

    public String getKwdikos() {
        return kwdikos;
    }

    public void setKwdikos(String kwdikos) {
        this.kwdikos = kwdikos;
    }

    public String getTitlos() {
        return titlos;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    @Override
    public String toString() {
        return "Mathima{" + "kwdikos=" + kwdikos + ", titlos=" + titlos + '}'+ "\n";
    }
    
    
    

    
}
