
package Three;

import java.util.Random;
import java.util.Scanner; 


public class GuessingNum {

   
    public static void main(String[] args) {
        System.out.println("Koji broj sam zamislio?");
        System.out.print("Unesi broj ");
        Scanner guess = new Scanner(System.in);
        int pogodi = guess.nextInt();
        Random rand = new Random();
       int zamisljeniBroj = rand.nextInt(3);
        
       
    } 
    
}
