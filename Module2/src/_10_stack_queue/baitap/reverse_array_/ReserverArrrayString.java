package _10_stack_queue.baitap.reverse_array_;

import java.util.Stack;

public class ReserverArrrayString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();

        String mWord = "Hello Word";
        String array[] = mWord.split("");
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(array[i]);
        }
        for (int i = 0; i < mWord.length(); i++) {
            array[i] = wStack.pop();
        }
        String st = "";
        for (int i = 0; i < array.length; i++) {
            st += array[i];
        }
        System.out.println("Mảng sau khi bị đảo ngược : " + st);
    }
}
