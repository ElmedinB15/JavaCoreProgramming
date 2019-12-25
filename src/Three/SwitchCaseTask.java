/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;

public class SwitchCaseTask {

   public static void main(String[] args) {
       
       String operator ="*"; 
        int operand1 = 5;
        int operand2 =3;
        
        switch(operator){
            
           case "+":
                
              System.out.println(operand1+operand2);
             break;
             
              case "-":
                
              System.out.println(operand1-operand2);
             break;
              case "*":
                
              System.out.println(operand1*operand2);
             break;
              case "/":
                
              System.out.println(operand1/operand2);
             break;
              case "%":
                
              System.out.println(operand1%operand2);
             break;
             
              default:
                  System.out.println("Numbers don't exist");
                  break;
        }
      
    }
  
    
}
