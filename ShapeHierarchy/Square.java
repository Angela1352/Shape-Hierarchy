
public class Square extends Rectangle {
    public Square(String col, boolean fill, double side) {
        super(col, fill, side, side);
    }

    @Override
    public void setLength(double s) {
        super.setLength(s);
        super.setWidth(s);
    }

    @Override
    public void setWidth(double s) {
        super.setLength(s);
        super.setWidth(s);
    }
}
