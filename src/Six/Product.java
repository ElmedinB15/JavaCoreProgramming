
package Six;


public abstract class Product {

private String nazivProizvoda;
private String barkod;
private double cijena;
private static final double porez = 0.17;

public Product(String nazivProizvoda, String barkod ,
                     double cijena){
    
    this.nazivProizvoda = nazivProizvoda;
    this.barkod = barkod;
    this.cijena = cijena;
  
    }   
public double Racunaj(){
    
    return cijena +(cijena*porez);
}
}