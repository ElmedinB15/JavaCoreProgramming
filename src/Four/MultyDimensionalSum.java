
package Four;

public class MultyDimensionalSum {

  
    public static void main(String[] args) {
        
        int [][] A = {
            {2,4,5},
            {1,3,7}, 
            {6,2,8} 
        };
        
        int [][]B = {
            {1,3,1},
            {8,9,4},
            {6,2,8}
        };
        
        int C[][] = new int [3][3];
        
        for(int i=0;i<C.length;i++){
        for(int j=0;j<C[i].length;j++){
            
            C[i][j] = A[i][j] + B[i][j];
            System.out.print(C[i][j]+" ");
        }
            System.out.println();
        }
    }
}
