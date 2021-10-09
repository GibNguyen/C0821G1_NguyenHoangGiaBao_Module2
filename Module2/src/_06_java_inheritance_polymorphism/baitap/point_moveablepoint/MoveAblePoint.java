package _06_java_inheritance_polymorphism.baitap.point_moveablepoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint() {
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] array = {this.getxSpeed(), this.getySpeed()};
        return array;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "),speed=(" + this.getxSpeed() + "," + this.getySpeed() + ")";
    }

    public MoveAblePoint move() {
        super.setX(super.getX() + this.getxSpeed());
        super.setY(super.getY() + this.getySpeed());
        return this;
    }
}
