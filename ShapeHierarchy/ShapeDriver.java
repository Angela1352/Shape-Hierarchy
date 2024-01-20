
public class ShapeDriver {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle("red", false, 4);
        shapes[1] = new Rectangle("yellow", true, 3, 5);
        shapes[2] = new Triangle("blue", false, 3, 4, 5);
        shapes[3] = new Square("green", true, 3);
        shapes[4] = new Pentagon("orange", false, 5.0);
        shapes[5] = new House("purple", true, 4, 6);

        shapes[0].displayInfo();
        shapes[1].displayInfo();
     
        System.out.println("\nPERIMETERS:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculatePerimeter());
        }

        System.out.println("\nAREAS:");
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
    }
}
