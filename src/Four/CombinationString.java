
package Four;


import java.util.Arrays;
import java.util.Random;


public class CombinationString { 
 
  
    public static void main(String[] args) { 
        
        String [] card ={"Heart","Cherry","Melon","Coin","Joker"};
       
        System.out.print(card[new Random().nextInt(card.length)]+" ");
        System.out.print(card[new Random().nextInt(card.length)]+" ");
        System.out.print(card[new Random().nextInt(card.length)]+" ");
        System.out.print(card[new Random().nextInt(card.length)]+" ");
        System.out.print(card[new Random().nextInt(card.length)]+" ");
   }

}
