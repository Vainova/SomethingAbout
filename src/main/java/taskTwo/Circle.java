package taskTwo;

import taskTwo.Inteface.GeometricShapes;

public class Circle implements GeometricShapes {
    private final double radius;
    private final String color;
    private final String borderColor;

    public Circle(double radius,String color, String borderColor) {
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter () {
      return calculatePerimeter(this.radius);
    }

    public double calculateArea () {
       return  Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
