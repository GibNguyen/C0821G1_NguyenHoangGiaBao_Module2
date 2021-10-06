package bai_tap_them;

import java.util.Scanner;

public class InTamGiacCan {
    public static void main(String[] args) {
        int h;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều cao của tam giác");
        h = input.nextInt();
        int m = h;
        int n = h;
        for (int j = 1; j <= h; j++) {
            for (int i = 1; i <= 2 * h - 1; i++) {
                if (i >= m && i <= n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            m--;
            n++;
            System.out.print("\n");
        }
    }
}
