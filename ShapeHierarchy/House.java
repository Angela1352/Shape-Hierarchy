
public class House extends Shape {
   private Square base;
   private Triangle roof;
   
   public House(String col, boolean fill, double baseSide, double roofSide) {
       super(col, fill);
       base = new Square(col, fill, baseSide);
       roof = new Triangle (col, fill, roofSide, roofSide, roofSide);
   }
    
   public Square getBase() {
       return base;
   }
   
   public void setBase(Square base) {
       this.base = base;
   }
   
   public Triangle getRoof() {
       return roof;
   }
   
   public void setRoof (Triangle roof) {
       this.roof = roof;
   }
   
   @Override
   public double calculateArea() {
       return base.calculateArea() + roof.calculateArea();
   }
   
   @Override
   public double calculatePerimeter() {
       return base.calculatePerimeter() + roof.calculatePerimeter();
   }
}
