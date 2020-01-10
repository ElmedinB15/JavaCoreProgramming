
package Four;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

   
    public static void main(String[] args) {
   
        ArrayList <Use> users = new ArrayList();
        
        users.add(new Use(4,"Goran"));
        users.add(new Use(2,"ilija"));
        users.add(new Use(6,"Nikola"));
        users.add(new Use(1,"Petar"));
        users.add(new Use(2,"Jovan"));
        users.add(new Use(3,"Zoran"));
        
            System.out.println("Before: "+users);
            
            users.sort(Comparator.comparingInt(Use::getId));
            
            System.out.println("After: "+users);
            
      
    }
    
}
