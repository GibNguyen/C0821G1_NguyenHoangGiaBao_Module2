package _09_arraylist_linkedlist.baitap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1, 10);
        listInteger.add(15);
        listInteger.add(4, 23);


        System.out.println(listInteger.get(2));

    }
}
