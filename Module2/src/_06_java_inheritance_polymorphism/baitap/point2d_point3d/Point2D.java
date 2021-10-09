package _06_java_inheritance_polymorphism.baitap.point2d_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
        this.x = 0.3f;
        this.y = 0.5f;
    }

    public Point2D(float x, float y) {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        float[] array = {this.getX(), this.getY()};
        return array;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
