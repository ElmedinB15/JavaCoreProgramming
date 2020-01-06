
package Seven;


public class User {

    public String id;
    public String name;
    public String score;
    
    public void parse(String povezivanje){
        
        String [] podaci = povezivanje.split("-");
        this.id = podaci[0];
        this.name= podaci[1];
        this.score = podaci[2];
        
    }
  
    
}
