
public class Pentagon extends Shape {
    private double side;

    public Pentagon(String col, boolean fill, double sid) {
        super(col, fill);
        side = sid;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 0.25 * Math.sqrt(5*(5+2*Math.sqrt(5))) * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side*5;
    }
}
