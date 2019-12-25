/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;

public class Remainder {

    public static void main(String[] args) {
       
        int x = 523134;
        int y = 325423;
        
        if(x%y==0){
            
            System.out.println("There is no remainder");
        }else if(x%y>1000||(x%y<1000)){
        
            System.out.println("Remainder is higher 1000 or lower 1000");
        
    }
       
    }
    
}
