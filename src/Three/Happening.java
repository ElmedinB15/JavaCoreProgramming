
package Three;
 

public class Happening {

    public static int Happening(int num){
        
        if(num==1){
            
           return 1; 
        }else{
           
            return Happening(num-1)+num;
        }
    } 
    
    public static void main(String[] args) {
    
        System.out.println(Happening(4));
        

    }
    
}
