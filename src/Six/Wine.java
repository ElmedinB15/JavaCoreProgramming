
package Six;


public class Wine extends Product {

    private static final double dodatniPorez = 0.1;
    private  double zapreminaBoce;
    public Wine(String nazivProizvoda, String barkod, double cijena,double zapreminaBoce) {
        super(nazivProizvoda, barkod, cijena);
        
        
    } public double Racunaj(){
        
        double cijenasaPDVom = super.Racunaj();
        return cijenasaPDVom +(cijenasaPDVom *dodatniPorez);

    }
}
