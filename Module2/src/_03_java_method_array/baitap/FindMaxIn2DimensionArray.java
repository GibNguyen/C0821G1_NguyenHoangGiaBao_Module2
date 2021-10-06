package _03_java_method_array.baitap;

import java.util.Scanner;

public class FindMaxIn2DimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of array : ");
        int row = Integer.parseInt(input.nextLine());
        System.out.println("Enter the colspan of array : ");
        int cols = Integer.parseInt(input.nextLine());
        int[][] array = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at index " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        int a=0;
        int b=0;
        int maxValue=array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if(array[i][j]>=maxValue){
                    maxValue=array[i][j];
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("Max value in the array is "+maxValue+" at the index "+"[" + a + "]" + "[" + b + "]");
    }
}
