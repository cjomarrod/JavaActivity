package Task15;

public class Circle extends AbstractShape {
    public Circle(String color, double radius) {
        super(color, radius, 0);  
    }

    @Override
    public double calculateArea() {
        return Math.PI * dimension1 * dimension1;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * dimension1;
    }
}