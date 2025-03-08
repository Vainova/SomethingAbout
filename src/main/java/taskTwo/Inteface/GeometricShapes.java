package taskTwo.Inteface;

public interface GeometricShapes {
    double calculatePerimeter();
    double calculateArea();

    String getColor();
    String getBorderColor();

   default double calculatePerimeter (double height, double width) {
      return 2 * (height + width);
   }

   default double calculatePerimeter (double footing, double sideA, double sideB) {
      return footing + sideA + sideB;
   }

   default double calculatePerimeter (double radius) {
       return  2 * Math.PI * radius;
   }
}
