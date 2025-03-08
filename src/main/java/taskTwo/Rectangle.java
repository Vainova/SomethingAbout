package taskTwo;

import taskTwo.Inteface.GeometricShapes;

public class Rectangle implements GeometricShapes {
    private final double height;
    private final double width;
    private final String color;
    private final String borderColor;

    public Rectangle(double height, double width, String color, String borderColor ) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return calculatePerimeter(this.height, this.width );
    }

    public double calculateArea () {
        return height * width;
    }

    public String getColor() {
        return color;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
