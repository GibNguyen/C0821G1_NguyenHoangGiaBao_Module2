package _13_thuattoansapxep.baitap.insertionsort;

public class InsertionSortByStep {
    public static void main(String args[]) {
        InsertionSort insertionSort=new InsertionSort();
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Mảng ban đầu:");
        insertionSort.printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        insertionSort.printArray(arr);
    }
}
