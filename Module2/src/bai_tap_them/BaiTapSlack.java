package bai_tap_them;

import java.util.Scanner;

public class BaiTapSlack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Nhập số nguyên n : ");
            n=input.nextInt();
        }
        while (n>=1&&n<=100);
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not weird");
        }
    }
}


