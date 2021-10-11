package _06_java_inheritance_polymorphism.baitap.point_moveablepoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint() {
        super();
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] array = {this.getXSpeed(), this.getYSpeed()};
        return array;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "),speed=(" + this.getXSpeed() + "," + this.getYSpeed() + ")";
    }

    public MoveAblePoint move() {
        super.setX(super.getX() + this.getXSpeed());
        super.setY(super.getY() + this.getYSpeed());
        return this;
    }
}
