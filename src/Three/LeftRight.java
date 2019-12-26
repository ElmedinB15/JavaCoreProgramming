

package Three;
 public class LeftRight {
  public static void main(String[] args) throws InterruptedException {
   int brojKoraka=10;
   int i=0;
   String smjer = "desno";
  while(true){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      Thread.sleep(300);

      System.out.print(" \r");


      if(smjer.equals("desno")){
        i++;
      }else{
        i--;
      }

      if(i==brojKoraka){
        smjer="lijevo";
      }
      if(i==0){
        smjer="desno";
      }



   }
  }
}