
package Four;

import java.util.Scanner;

public class RPS {

    
    public static void main(String[] args) {
     
        Scanner kpm = new Scanner(System.in);
        String pick = kpm.nextLine();
     
        
        if(Allowed(pick)){
            
            int randpick = (int)(Math.random()*3);
            int myChoice = mergeAllowed(pick);
            System.out.println("You picked "+pick);
            System.out.println("PC picked " + PCpick(randpick));
            System.out.println("You "+WhoWon(myChoice,randpick));
       } else {
            
            System.out.println("Non-existant value :(");
            
       }
     
       }
    
    public static String PCpick(int Pc){
        
        if(Pc ==0){
        return "rock";   
        }
        if(Pc==1){
        return "paper";
        }
        if(Pc==2){
            
        return "scissors";
        }
        return "No idea";
        } 
   
    public static String WhoWon(int MyChoice,int PCchoice){
        
        if(MyChoice ==0){
        if(PCchoice!=1){
        if(PCchoice!=0){
        return "Won";
        }
        return "Tie";
        
        }
        return "Lost";
        }
       if(MyChoice==1){
           
        if(PCchoice!=2){
        if(PCchoice!=1){
               
        return "Won";
        }  
        return "Tie";
        }
        return "Lost";
        }  
        if(MyChoice ==2){
       if(PCchoice!=1){
       if(PCchoice!=2){
                 
        return "Won";
        }
        return "Tie";    
        } 
        return "Lost";
        }
        return "have no clue";
        }
    
    public static boolean Allowed(String maybe){
        if(maybe.equalsIgnoreCase("rock")){
            return true;
        }
        if(maybe.equalsIgnoreCase("paper")){
            return true;
        }
        if(maybe.equalsIgnoreCase("scissors")){
            return true;
        }
        return false;
        }
    public static int mergeAllowed(String yes){
        
        if(yes.equalsIgnoreCase("rock")){
            return 0;
        }
        if(yes.equalsIgnoreCase("paper")){
            return 1;
            
        } 
        if (yes.equalsIgnoreCase("scissors")){
             return 2;
        }
           
        return 10000000; 
        }
        }
