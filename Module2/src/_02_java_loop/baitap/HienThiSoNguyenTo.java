package _02_java_loop.baitap;

import javax.swing.*;
import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Số lượng số nguyên tố muốn in: ");
        int count = 0;
        int N = 2;
        int numbers = input.nextInt();
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                } else check = true;
            }

            if (check == true) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}

