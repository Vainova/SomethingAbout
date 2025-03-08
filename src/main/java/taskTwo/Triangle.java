package taskTwo;

import taskTwo.Inteface.GeometricShapes;

public class Triangle implements GeometricShapes {
    private final double sideA;
    private final double sideB;
    private final double footing;
    private final double height;
    private final String color;
    private final String borderColor;

    public Triangle(String color, String borderColor, double sideA, double sideB, double footing, double height) {
        this.color = color;
        this.borderColor = borderColor;
        this.sideA = sideA;
        this.sideB = sideB;
        this.footing = footing;
        this.height = height;
    }

    public double calculatePerimeter () {
        return calculatePerimeter(this.footing, this.sideA, this.sideB);
    }

    public double calculateArea () {
        return  footing * height / 2;
    }

    public String getColor() {
        return color;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
