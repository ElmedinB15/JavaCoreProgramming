package three;
import java.util.Random;
import java.util.Scanner;

public class  RightLeft {
  public static void main(String[] args) {
    Random rand = new Random();
    int zamisljeniBroj = rand.nextInt(3);
    Scanner sc = new Scanner(System.in);
    int broj;
    
    
    do{
      System.out.println("Uneseni broj: ");
      broj = sc.nextInt();
      if(broj>zamisljeniBroj){
        System.out.println("Nije!");
      }

    }while(broj!=zamisljeniBroj);

    System.out.println("Jeste!");
   }
    
}