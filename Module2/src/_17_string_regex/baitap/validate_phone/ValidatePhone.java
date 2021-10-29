package _17_string_regex.baitap.validate_phone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number (xx)-(xxxxxxxxxx) ");
        String phone = scanner.nextLine();
        while (!Pattern.matches("^\\([0-9]{2}\\)(-)\\((0)[0-9]{9}\\)$",phone)){
            System.out.println("Wrong number, please Enter again ");
            phone = scanner.nextLine();
        }
        System.out.println("The number is added");
    }
}
