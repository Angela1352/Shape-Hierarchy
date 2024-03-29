
public class Circle extends Shape {
    
    private double radius;
    
    public Circle(String col, boolean fill, double radius) {
        super(col, fill);
        setRadius(radius);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
