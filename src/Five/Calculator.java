
package Five;


public class Calculator {

    
    public double operand1;
    public double operand2; 
 

    public  double add(){
        
        return operand1+operand2;
           
    }   
   public double sub(){
        
        return operand1-operand2;
    }
    public double mul(){
        return operand1*operand2;
    }
    public double div(){
        return operand1/operand2;
    }    
    
    public void ADD(double addop1,double addop2){
        
        operand1= addop1;
        operand2= addop2;
    }
    }
     
    