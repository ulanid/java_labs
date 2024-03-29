import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(30);
        linkedList.add(15);
        linkedList.add(2);

        System.out.println("Iterating over elements in linked list:");
        for (Integer value : linkedList) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

/////////////////////////////////////////////////////////////////        

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        ArrayList<Integer> innerList1 = new ArrayList<>();

        innerList1.add(15);
        innerList1.add(25);
        innerList1.add(10);

        arrayList.add(innerList1);

        System.out.println("Iterating over elements in array list:");
        for (ArrayList<Integer> innerList : arrayList) {
            for (Integer value : innerList) {
                System.out.print(value + " ");
            } 
        }
        System.out.println("\n");

/////////////////////////////////////////////////////////////////  

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("pineapple");
        hashSet.add("watermelon");
        hashSet.add("coconut");

        System.out.println("Iterating over elements in hash set:");
        for (String value : hashSet) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

/////////////////////////////////////////////////////////////////  

        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        System.out.println("Size of the map: " + map.size());
    }
}
