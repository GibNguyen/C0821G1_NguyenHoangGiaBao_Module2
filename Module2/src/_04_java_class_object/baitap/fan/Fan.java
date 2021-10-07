package _04_java_class_object.baitap.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    }
    public String toString(){
        String str="";
        if(this.on){
            System.out.println(str+="speed "+this.speed+" color "+this.color+" radius "+radius+" fan is on ");
            return str;
        }
        else {
            System.out.println(str+="color "+this.color+" radius "+radius+" fan is off ");
            return str;
        }
    }
}
