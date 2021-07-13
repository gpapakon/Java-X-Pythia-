package Model;

import java.util.ArrayList;

/**
 *
 * @author papakon
 */
public class Foithths {
    private int AM;
    private String eponimo;
    private String name;
    private ArrayList <Dhlwsh> dilwseis=new ArrayList<>();

    public Foithths(int AM, String eponimo, String name) {
        this.AM = AM;
        this.eponimo = eponimo;
        this.name = name;
    }

    public boolean addDhlwsh(Dhlwsh dhl){
        if(dhl.getMathima() instanceof Ergasthrio){
            for(int i=0;i<dilwseis.size();i++){
                if(dhl.getMathima().getKwdikos().substring(0,4).equals(dilwseis.get(i).getMathima().getKwdikos().substring(0,4))){
                    dilwseis.add(dhl);
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            Theoria tempMath=(Theoria) dhl.getMathima();
            if(tempMath.getProapaitoumeno().isEmpty()){
                dilwseis.add(dhl);
                return true;
            }else{
                int flag=0;
                for(int i=0;i<tempMath.getProapaitoumeno().size();i++){
                    for(int j=0;j<dilwseis.size();j++){
                        if(dilwseis.get(j).getMathima() instanceof Theoria){
                            if(tempMath.getProapaitoumeno().get(i).getKwdikos().substring(0,4).equals(((Theoria)dilwseis.get(j).getMathima()).getKwdikos().substring(0,4))){
                                if(this.dilwseis.get(j).getVathmo()>=5){
                                  flag++;  
                                }
                                
                            }  
                        }
                    }
                }
                if(flag==((Theoria)dhl.getMathima()).getProapaitoumeno().size()){
                    dilwseis.add(dhl);
                    return true;
                }
            }    
        }
      return false;  
    }

    public ArrayList<Dhlwsh> getDhlwsh() {
        return dilwseis;
    }

    @Override
    public String toString() {
        return "Foithths{" + "AM=" + AM + ", eponimo=" + eponimo + ", name=" + name + ", dilwseis=" + dilwseis + '}'+ "\n";
    }
    
    
    
    
}
