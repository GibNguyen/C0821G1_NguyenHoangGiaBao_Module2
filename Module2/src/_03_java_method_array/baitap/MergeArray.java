package _03_java_method_array.baitap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int a=0;
        int index =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array 1 : ");
        size1 = input.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter the elment " + (i + 1) + " of array 1");
            array1[i] = input.nextInt();
        }
        System.out.println("Enter the size of array 2 : ");
        size2 = input.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter the elment " + (i + 1) + " of array 2");
            array2[i] = input.nextInt();
        }
        int[] array3= new int[size1+size2];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i];
            index++;
        }
        for (int j=index;j<array3.length;j++){
            array3[j]=array2[a];
            a++;
        }
        System.out.println("Mảng mới có phần tử : ");
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }
    }
}