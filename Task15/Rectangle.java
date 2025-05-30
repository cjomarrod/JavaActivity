package Task15;

public class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return dimension1 * dimension2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (dimension1 + dimension2);
    }
}
