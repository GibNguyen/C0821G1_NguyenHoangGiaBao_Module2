import java.util.Scanner;

public class baitap_chuyendoitiente {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Nhập USD : ");
        Scanner input = new Scanner(System.in);
        int usd = input.nextInt();
        int vnd = usd*23000;
        System.out.printf("Trị giá %d VND",vnd);
    }
}
