package _04_java_class_object.baitap.quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Nhập số b");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Nhập số c");
        double c = Double.parseDouble(input.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta=quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm là " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm là " + quadraticEquation.getRoot3());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
