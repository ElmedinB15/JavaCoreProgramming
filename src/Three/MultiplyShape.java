
package Three;

public class MultiplyShape {

    
    public static void main(String[] args) {
       
        int lines =20;
        
        for(int i=0;i<lines;i++){
             System.out.print("-");
    }
        System.out.println();
        System.out.print("#     ");
        
        for(int i=1;i<=3;i++){
            System.out.print(i+"     "); 
        }
        System.out.println();
        
        for(int i=0;i<lines;i++){
            
            System.out.print("-");
        }
        System.out.println();
        
        for(int i =1;i<=10;i++){
    System.out.println(i+"     "+(i*1)+"     "+(i*2)+"     "+(i*3));
           
        }
        System.out.println();
    }  
}
