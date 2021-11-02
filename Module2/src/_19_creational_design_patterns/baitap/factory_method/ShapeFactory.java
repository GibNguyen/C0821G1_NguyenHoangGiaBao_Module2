package _19_creational_design_patterns.baitap.factory_method;

public class ShapeFactory {
    private ShapeFactory(){};
    public static Shape getShape(String shape){
        switch (shape){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new RuntimeException("The Shape dont't exit");
        }
    }
}
