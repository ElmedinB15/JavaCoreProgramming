
package Three;

//moj odgovor je: 3 puta prije izbacivanja rezultata
public class RecursionControl {

    public int value;
 
    public static void counter (int start,RecursionControl stop){
        
        System.out.println("Hey!I am called");
        if(stop.value>start){
            
            return;
        }
        ++stop.value;
        counter(start--,stop);
    }
   
    public static void main(String[] args) {
      
        RecursionControl stop = new RecursionControl();
        int start = 5;
        stop.value = 2;
        counter(start,stop);
    }
    
}
