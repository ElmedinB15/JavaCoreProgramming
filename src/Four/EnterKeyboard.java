
package Four;

import java.util.Scanner;

 
public class EnterKeyboard {

  
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();
        String emtyLine2 = keyboard.nextLine();
        String emtyLine = keyboard.nextLine();
        
        int result = num1+num2+num3;
        
        System.out.println(num1+" "+num2+" "+ " "+num3
                +" Result is: "+ result);
     
    }
    
}
