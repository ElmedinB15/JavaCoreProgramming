package Seven;

import static java.lang.Double.sum;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TryCatch {

    public static void main(String[] args) {

        int num = 0;
        do{
            
        try{
        int number1;
        int number2;
        number1 = new Scanner(System.in).nextInt();
        number2 = new Scanner(System.in).nextInt();
       
        int sum = number1+number2;
        
            System.out.println(sum);
        } catch (Exception ex){
            
            System.out.println("You are incorrect user!");
        }
      num++;
    } while (num!=4);
        
        System.out.println("Code Successful");
  }
}
