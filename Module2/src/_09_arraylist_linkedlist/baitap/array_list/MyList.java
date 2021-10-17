package _09_arraylist_linkedlist.baitap.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (this.size >= elements.length) {
            this.ensureCapa();
        }
        if (elements[index]==null){
            elements[index]=element;
        }else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            this.size++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < this.size; i++) {
            elements[i] = elements[i + 1];
        }
    }

    public int size() {

        return this.size;
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (this.size >= elements.length) {
            this.ensureCapa();
        }
        elements[size] = element;
        size++;
        return true;
    }
    public E get(int index){
        return (E) elements[index];
    }
}
