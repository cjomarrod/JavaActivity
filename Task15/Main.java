package Task15;

public class Main {
    public static void main(String[] args) {
    
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
       
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
