package _02_java_loop.baitap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Your Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("WIDTH: ");
                int width = input.nextInt();
                System.out.println("HEIGHT: ");
                int height = input.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                ;
                break;
            case 2:
                System.out.println("HEIGHT: ");
                int height1 = input.nextInt();
                for (int i = 0; i < height1; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                ;
                break;
            case 3:
                System.out.println("HEIGHT: ");
                int height2 = input.nextInt();
                for (int i = 0; i < height2; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                ;
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!");
        }
    }
}
