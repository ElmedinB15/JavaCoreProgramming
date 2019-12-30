
package Four;


public class ShapeX_O {
    
    public static void main(String[] args) {
        
    
       int [][] points ={{2,4},{1,5},{6,6},{3,2},{0,0}};
        
       
       int width=20,height=10;
      
       for(int y=0;y<height;y++){
     
        for(int x=0;x<width;x++){
                
            boolean postoji=false;
            
                     for(int i=0;i<points.length;i++){
                         
                       if(x==points[i][0] && y ==points[i][1]){
                           
                         postoji=true;
                        break;
                       }
                     }

                    if(postoji){
                       System.out.print("X");
                    }else{
                       System.out.print("O");
                     }

             
        }
  System.out.println();
      }
    }
}