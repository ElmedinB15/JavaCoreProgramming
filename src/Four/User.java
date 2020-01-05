
package Four;


public class User {
     
    public int id;
    public String ime;
    
    public User(int id, String ime){
        
        this.id =id;
        this.ime =ime;
    }
    public int getId(){
        
        return id;
    }
    
    public String getIme(){
        
        return ime;
    }
    public String toString(){
        
        StringBuilder data = new StringBuilder();
        
        data.append(id);
        data.append(" ");
        data.append(ime);
        
        return data.toString();
    }
    
    
}
