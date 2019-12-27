
package Five;

public class Square extends Shape {
    
    private double a;

    public Square(double x, double y, String color, String name,double a) {
        super(x, y, color, name);
        
        this.a = a;
    }
    
    
    @Override 
    public double area(){
        
        return a*a;
    }
    
}
 