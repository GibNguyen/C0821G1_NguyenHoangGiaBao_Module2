package _10_stack_queue.baitap.treemap;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String str = "Ha Noi ha";
        String[] array = str.toLowerCase().split(" ");
        Map<String,Integer> mymap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String key = array[i];
            if(mymap.containsKey(key)){
                int value=mymap.get(key);
                mymap.put(key,value+1);
            }
            else {
                mymap.put(key,1);
            }
        }
        System.out.println(mymap);
    }
}
