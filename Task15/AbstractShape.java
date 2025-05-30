package Task15;

public abstract class AbstractShape implements Shape {
    protected String color;
    protected double dimension1; 
    protected double dimension2;  

    public AbstractShape(String color, double dimension1, double dimension2) {
        this.color = color;
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}