package Chapter11.Task18andTask19;

import java.util.*;

/*Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the
 * pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.*/

/*Exercise 19: Repeat the previous exercise with a HashSet and LinkedHashSet.*/

public class HashSetTest {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key 4","apple");
        hashMap.put("key 3","pineapple");
        hashMap.put("key 5","onion");
        hashMap.put("key 2","caret");
        hashMap.put("key 1","caret");

        System.out.println(hashMap);
        hashMap.forEach((k,v) -> System.out.println(k + ":"+v));
       // hashMap.forEach((k,v) -> hashMap.put(k, "something"));

        System.out.println("LinkedHashMap");
        Map<String, String> ll = new LinkedHashMap<>(hashMap);
        ll.forEach((k,v) -> System.out.println(k + ":"+v));

        System.out.println("HashSet");
        Set<String> hashSet = new HashSet(hashMap.values());
        hashSet.forEach((k) -> System.out.println(k));

        System.out.println("LinkedHashSet");
        Set<String> linkedHashSet = new LinkedHashSet<>(hashMap.values());
        linkedHashSet.forEach((k) -> System.out.println(k));
    }
}
