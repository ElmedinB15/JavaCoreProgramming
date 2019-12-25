
package Four;

import java.util.Scanner;
 
public class Language {

    public static void main(String[] args) {
        
        System.out.print("Chose language: ");
        Scanner sc = new Scanner(System.in);
        String language = sc.next();
        System.out.print("Odaberi prvi operand : ");
        int operand1 = sc.nextInt();
        System.out.print("Odaberi drugi operand: ");
        int operand2 = sc.nextInt();
        
        int result = operand1+operand2;
        
        switch (language.toLowerCase()){
            
            case "English": System.out.println("Good afternoon!");
                            System.out.println("Result is: "+result);
                            break;
       
            case "German": System.out.println("Guten Tag!");
                  System.out.println("Ergebnist ist: "+result);
                  break;
                  
            default: System.out.println("Invalid language");
            break;
            
    }
    }  
    }
