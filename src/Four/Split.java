
package Four;

import Four.User;


public class Split {

   
    public static void main(String[] args) {
    
        User u = new User();
        u.parse("1-Peter-150");
        
        System.out.println(u.id);
        System.out.println(u.name);
        System.out.println(u.score);
    }
    
}
