package review.nhapxuatthongtinxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
       do{
        System.out.println("Menu" + "\n"
                + "1. Tạo các đối tượng xe và nhập thông tin" + "\n"
                + "2. Xuất bảng kê khai tiền thuế của các xe" + "\n"
                + "3. Thoát");
         n = Integer.parseInt(input.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Nhập giá trị xe :");
                    int giaTri = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập dung tích xe ");
                    int dungTich = Integer.parseInt(input.nextLine());
                    Vehicle vehicle = new Vehicle(giaTri, dungTich);
                    break;
                case 2:

                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Hãy chọn 1 mục");
            }
        }
        while (n!=3);
    }
}
