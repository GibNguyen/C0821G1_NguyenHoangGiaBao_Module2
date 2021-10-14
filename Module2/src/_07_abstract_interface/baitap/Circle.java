package _07_abstract_interface.baitap;

public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return super.getColor();
    }

    public void setColor (String color){
        super.setColor(color);
    }

    public boolean isFilled(){
        return super.isFilled();
    }

    public void setFilled (boolean filled){
        super.setFilled(filled);
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius= "+this.radius+", which is a subclass of " + super.toString();


    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()+this.getRadius()*percent);
    }
}
