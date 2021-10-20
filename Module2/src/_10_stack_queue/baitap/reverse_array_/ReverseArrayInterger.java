package _10_stack_queue.baitap.reverse_array_;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayInterger {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);//5,4,3,2,1
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}

