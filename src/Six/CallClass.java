
package Six;


public class CallClass {


    public static void main(String[] args) {
  
        Chocolate c = new Chocolate("Chocolate","37338HSJD",2.5,200);
        
        System.out.println(c.Racunaj());
        
        Wine w = new Wine("Wine","47857FHIK",5,2);
        
        System.out.println(w.Racunaj());
    }
    
}
