package Chapter17.Task12;

import java.util.*;

/*Exercise 12
// Substitute a HashMap, a TreeMap and a LinkedHashMap*/

public class TestMap<K,V> {

    private Object[][] pairs;
    private int index;
    public TestMap(int length) {
        pairs = new Object[length][2];
    }
    public void put(K key, V value) {
        if(index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[] { key, value };
    }
    @SuppressWarnings("unchecked")
    public V get(K key) {
        for(int i = 0; i < index; i++)
            if(key.equals(pairs[i][0]))
                return (V)pairs[i][1];
        return null; // Did not find key
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if(i < index - 1)
                result.append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        TestMap<String,String> map =
                new TestMap<String,String>(6);
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        try {
            map.put("extra", "object"); // Past the end
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many objects");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
        HashMap<String,String> hashMap = new HashMap<String,String>(6);
        hashMap.put("sky", "blue");
        hashMap.put("grass", "green");
        hashMap.put("ocean", "dancing");
        hashMap.put("tree", "tall");
        hashMap.put("earth", "brown");
        hashMap.put("sun", "warm");
        try {
            hashMap.put("extra", "object"); // Past the end
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many objects");
        }
        System.out.println(hashMap);
        System.out.println(hashMap.get("ocean"));
        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        treeMap.put("sky", "blue");
        treeMap.put("grass", "green");
        treeMap.put("ocean", "dancing");
        treeMap.put("tree", "tall");
        treeMap.put("earth", "brown");
        treeMap.put("sun", "warm");
        try {
            treeMap.put("extra", "object"); // Past the end
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many objects");
        }
        System.out.println(treeMap);
        System.out.println(treeMap.get("ocean"));
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>(6);
        linkedHashMap.put("sky", "blue");
        linkedHashMap.put("grass", "green");
        linkedHashMap.put("ocean", "dancing");
        linkedHashMap.put("tree", "tall");
        linkedHashMap.put("earth", "brown");
        linkedHashMap.put("sun", "warm");
        try {
            linkedHashMap.put("extra", "object"); // Too far
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many objects");
        }
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("ocean"));
    }
}
