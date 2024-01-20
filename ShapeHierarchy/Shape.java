
/**
 * Angela Chen
 * Jan 11, 2024
 */

public class Shape {

    private String color;
    private boolean filled;

    public Shape(String col, boolean fill) {
        color = col;
        filled = fill;
    }

    public double calculateArea() {
        //To be overidden by subclasses
        return 0;
    }

    public double calculatePerimeter() {
        //To be overidden by subclasses
        return 0;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
