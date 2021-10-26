package _14_exception.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the three side of triangle ");
                int sideOne = Integer.parseInt(input.nextLine());
                int sideTwo = Integer.parseInt(input.nextLine());
                int sideThree = Integer.parseInt(input.nextLine());
                if (sideOne < 0 || sideTwo < 0 || sideThree < 0) {
                    throw new IllegalTriangleException("The side of triangle must over 0");
                }
                if (sideOne + sideTwo < sideThree || sideOne + sideThree < sideTwo || sideTwo + sideThree < sideOne) {
                    throw new IllegalTriangleException("That is not a triangle");
                }
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
