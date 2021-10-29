package _17_string_regex.baitap.validate_class_name;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the class name ");
        String className=scanner.nextLine();
        while (!Pattern.matches("^[CAP][0-9]{4}[GHIKLM]$",className)){
            System.out.println("Wrong name class, please enter again ");
            className = scanner.nextLine();
        }
        System.out.println("Class is added ");
    }
}
