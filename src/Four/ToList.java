
package Four;


import java.util.ArrayList;




public class ToList {

  
    public static void main(String[] args) {
    
        ArrayList usersToAdd = new ArrayList();
        
        usersToAdd.add(new User(4,"Goran"));
        usersToAdd.add( new User(2,"Ilija"));
        usersToAdd.add(new User(6,"Nikola"));
        
       
        
        ArrayList users = new ArrayList();
        users.add(new User(1,"Petar"));
        users.add(new User(2,"Jovan"));
        users.add(new User(3,"Zoran"));
        
        usersToAdd.set(1,"5 Mario");
       
        usersToAdd.addAll(users);
        
        for(Object ob: usersToAdd){
            
            System.out.println(ob);
        }
       

    }
    
}
