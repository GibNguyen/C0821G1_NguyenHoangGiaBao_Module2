import java.util.Scanner;

public class baitap_docso_thanhchu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số muốn đọc : ");
        int num = input.nextInt();
        int tram = num / 100;
        int chuc = (num - (tram * 100)) / 10;
        int donvi = (num - (tram * 100 + chuc * 10));
        switch (tram) {
            case 1:
                System.out.printf("Một trăm");
                break;
            case 2:
                System.out.printf("Hai trăm");
                break;
            case 3:
                System.out.printf("Ba trăm");
                break;
            case 4:
                System.out.printf("Bốn trăm");
                break;
            case 5:
                System.out.printf("Năm trăm");
                break;
            case 6:
                System.out.printf("Sáu trăm");
                break;
            case 7:
                System.out.printf("Bảy trăm");
                break;
            case 8:
                System.out.printf("Tám trăm");
                break;
            case 9:
                System.out.printf("Chín trăm");
                break;
            default:
                break;
        }
        switch (chuc) {
            case 1:
                System.out.printf(" Mười");
                break;
            case 2:
                System.out.printf(" Hai mươi");
                break;
            case 3:
                System.out.printf(" Ba mươi");
                break;
            case 4:
                System.out.printf(" Bốn mươi");
                break;
            case 5:
                System.out.printf(" Năm mươi");
                break;
            case 6:
                System.out.printf(" Sáu mươi");
                break;
            case 7:
                System.out.printf(" Bảy mươi");
                break;
            case 8:
                System.out.printf(" Tám mươi");
                break;
            case 9:
                System.out.printf(" Chín mươi");
                break;
            default:
                break;
        }
        switch (donvi) {
            case 1:
                System.out.printf(" Một");
                break;
            case 2:
                System.out.printf(" Hai ");
                break;
            case 3:
                System.out.printf(" Ba ");
                break;
            case 4:
                System.out.printf(" Bốn ");
                break;
            case 5:
                System.out.printf(" Năm ");
                break;
            case 6:
                System.out.printf(" Sáu ");
                break;
            case 7:
                System.out.printf(" Bảy ");
                break;
            case 8:
                System.out.printf(" Tám ");
                break;
            case 9:
                System.out.printf(" Chín ");
                break;
            default:
                break;
        }
    }
}
