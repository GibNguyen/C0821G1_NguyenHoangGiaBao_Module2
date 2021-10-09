package _06_java_inheritance_polymorphism.baitap.circle_clynder;

public class Circle {
    private int r;
    private String color;
    public static final double PI =3.14;
    public Circle() {
        this.r=1;
        this.color="blue";
    }

    public Circle(int r, String color) {
        this.r = r;
        this.color = color;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double tinhDientich(int r){
        return r*r*PI;
    }
    @Override
    public String toString(){
        return "Hình tròn có bán kính là "+this.getR()+" và có màu là "+this.getColor()+" và có diện tích là "+tinhDientich(this.getR());
    }
}
