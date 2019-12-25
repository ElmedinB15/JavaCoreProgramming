/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;

public class SumbyString{
    
        public static void main(String[] args) {
     
        String operator ="+";
        double operand1 = 5;
        double operand2 =3;
        
        if(operator.equals("+")){ 
            
            System.out.println("Addition: "+operand1+operand2);
        }else if (operator.equals("-")){
            
            System.out.println(operand1-operand2);
            
        }else if (operator.equals("*")){
            
            System.out.println(operand1*operand2);
            
        }else if (operator.equals("/")){
            
            System.out.println(operand1-operand2);
            
        }else if (operator.equals("%")){
            
            System.out.println(operand1%operand2);
            
        }
    }    
    
}
    

