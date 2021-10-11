package _06_java_inheritance_polymorphism.baitap.point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
        MoveAblePoint moveAblePoint = new MoveAblePoint(0.3f, 0.4f, 0.5f, 0.7f);
        System.out.println(moveAblePoint.move().toString());
    }
}
