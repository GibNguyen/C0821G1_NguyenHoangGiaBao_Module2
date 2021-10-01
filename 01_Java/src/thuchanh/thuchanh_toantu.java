import java.util.Scanner;

public class thuchanh_toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width ");
        width = input.nextFloat();
        System.out.println("Enter height ");
        height = input.nextFloat();
        float area = width*height;
        System.out.println("Area is "+area);
    }
}

