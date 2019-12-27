
package Five;

public class Circle extends Shape {
    
    private double r;
    private static double PI = 3.14;

    public Circle(double x, double y, String color, String name,double r) {
        super(x, y, color, name);
        
        this.r = r;
    }
    
    @Override
    
    public double area(){
        return r*r*PI;
    }
 
  
    
}
 