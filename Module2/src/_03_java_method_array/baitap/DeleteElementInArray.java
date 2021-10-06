package _03_java_method_array.baitap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 9};
        int x;
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tủ muốn xóa ");
        x = input.nextInt();
        for (int i = 0; i < array.length; i++) {

            if (array[i] == x) {
                index = i;
            }
        }
        for (int j = index; j < array.length-1; j++) {
            array[j]=array[j+1];
        }
        int[] array1 = new int[array.length-1];
        for(int i=0;i<array1.length;i++){
            array1[i]=array[i];
            System.out.print(array1[i]+" ");
        }
    }
}
