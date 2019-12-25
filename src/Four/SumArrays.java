
package Four;
 

public class SumArrays {

 
    public static void main(String[] args) {
        
        int[] A = {1,2,3};
        int[] B = {4,5,6}; 
        int[] C = new int [3];
      
        for (int i =0;i<C.length;i++){
            
            C[i]=A[i]+B[i];
            System.out.print(C[i]+" "); 
        } 
       
    } 
}
