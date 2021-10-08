package _05_java_acess_modifier.baitap.acessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Circle() {
    }

    Circle(double radius) {
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
