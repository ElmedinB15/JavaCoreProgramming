
package Five;

public class Triangle extends Shape {

    private double a;
    private double b; 
    private double c;
    
    public Triangle(double x, double y, String color, String name,
            double a,double b,double c) {
        super(x, y, color, name);
        
        this.a=a;
        this.b=b;
        this.c =c;
    }
    
   @Override
            
   public double area(){
                
       return 1*b*c;
            }
   
           }
 