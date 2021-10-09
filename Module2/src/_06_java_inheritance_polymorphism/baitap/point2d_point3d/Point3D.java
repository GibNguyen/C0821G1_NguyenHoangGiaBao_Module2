package _06_java_inheritance_polymorphism.baitap.point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
        this.z = 0.7f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] array = {super.getX(), super.getY(), this.getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.getZ() + ")";
    }
}
