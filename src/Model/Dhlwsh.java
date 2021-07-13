package Model;

/**
 *
 * @author papakon
 */
public class Dhlwsh {
    private String hmDhlwshs;
    private String hmExetashs;
    private Mathima mathima;
    private double vathmo;

    public Dhlwsh(String hmDhlwshs, Mathima mathima) {
        this.hmDhlwshs = hmDhlwshs;
        this.mathima = mathima;
    }

    public String getHmDhlwshs() {
        return hmDhlwshs;
    }

    public void setHmDhlwshs(String hmDhlwshs) {
        this.hmDhlwshs = hmDhlwshs;
    }

    public Mathima getMathima() {
        return mathima;
    }

    public void setMathima(Mathima mathima) {
        this.mathima = mathima;
    }

    public double getVathmo() {
        return vathmo;
    }

    public boolean addVathmo(String hmEx,double vathmo) {
        if(this.mathima==null){
            return false;
        }else{
            this.vathmo=vathmo;
            this.hmExetashs=hmEx;
            return true;
        }
    }
    
    @Override
    public String toString() {
        return "Dhlwsh{" + "hmDhlwshs=" + hmDhlwshs + ", hmExetashs=" + hmExetashs + ", mathima=" + mathima + ", vathmo=" + vathmo +'}'+ "\n";
    }
    
    
}
