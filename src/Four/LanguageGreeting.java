
package Four;

import java.util.Scanner;


public class LanguageGreeting {


    public static void main(String[] args) {
        
        System.out.print("Choose language: ");
        Scanner picked = new Scanner(System.in);
        String language = picked.next(); 
                
        switch(language){
            
            case "English": System.out.println("Hello!"); break;
        
            case "Italian": System.out.println("Ciao!");  break;
            
            case "Arabic": System.out.println("اسّلام علىكم");break;
            default: System.out.println("Invalid language");
    }
        
        
    }
    
}
