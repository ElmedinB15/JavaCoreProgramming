
package Five;


public class CallMathShapes {

    public static void main(String[] args) {
    
        Circle callCircle = new Circle(1,1,"Blue","Circle",2);
        System.out.println("Result of area of Circle is: "+callCircle.area());
        
        Square callSquare = new Square(1,2,"Red","MySquare",3);
        System.out.println("Result of area of Square is: "+callSquare.area());
        
        Triangle callTriangle = new Triangle(1,1,"Purple","MyTriangle",1,2,3);
        System.out.println("Result of area of Triangle is: "
                +callTriangle.area());
            
            
        
    }
    
}
