package _06_java_inheritance_polymorphism.baitap.circle_clynder;

public class Clynder extends Circle {
    int height;

    public Clynder() {
        this.height = 4;
    }

    public Clynder(int r, String color, int height) {
        super(r, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double tinhTheTich(int r, int height) {
        return PI * r * r * height;
    }
    @Override
    public String toString() {
        return "Hình trụ có bán kính đáy là " +super.getR() + " và có thể tích là " + tinhTheTich(super.getR(), this.getHeight());
    }
}

