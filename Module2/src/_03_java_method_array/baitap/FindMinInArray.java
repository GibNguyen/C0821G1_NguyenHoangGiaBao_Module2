package _03_java_method_array.baitap;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of element in array : ");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the element "+(i+1));
            array[i]= Integer.parseInt(input.nextLine());
        }
        int minValue = array[0];
        for(int i=0;i<array.length;i++){
            if(minValue>=array[i]){
                minValue=array[i];
            }
        }
        System.out.println("The Min value in array is "+minValue);
    }
}
