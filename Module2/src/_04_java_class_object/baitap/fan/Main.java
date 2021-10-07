package _04_java_class_object.baitap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan1.toString();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        fan2.toString();
    }
}
