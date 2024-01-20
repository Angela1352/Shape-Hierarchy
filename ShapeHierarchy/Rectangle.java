
public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String col, boolean fill, double len, double wid) {
        super(col, fill);
        length = len;
        width = wid;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return (length*2) + (width*2);
    }
}

