package Chapter11.Task24;

import java.util.*;

/*Exercise 24, page 423
/* Fill a LinkedHashMap with String keys and objects of your choice.
* Now extract the pairs, sort them based on the keys, and reinsert
* them into the Map*/
public class LinckedHashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> lHM =new LinkedHashMap<String, Integer>();


        lHM.put("five", 5);
        lHM.put("zero", 0);
        lHM.put("two", 2);
        lHM.put("eight", 8);
        lHM.put("one", 1);
        System.out.println("Before");
        lHM.forEach((k,v) -> System.out.print(k+"-"+v+" " ));

        Map<String, Integer> sortMap =new LinkedHashMap<String, Integer>();

        Set<String> set = new TreeSet<>(lHM.keySet());
        Iterator<String> it =set.iterator();
        while (it.hasNext()) {
            String str = it.next().toString();
            Integer value = lHM.get(str);
            lHM.remove(str);
            sortMap.put(str,value);
        }
        System.out.println();
        System.out.println("sortMap");
        sortMap.forEach((k,v) -> System.out.print(k+"-"+v+" "));

        Set<String> setTmp = new TreeSet<>(sortMap.keySet());
        Iterator<String> it2 =setTmp.iterator();
        while (it2.hasNext()) {
            String str = it2.next().toString();
            Integer value = sortMap.get(str);
            sortMap.remove(str);
            lHM.put(str,value);
        }
        System.out.println();
        System.out.println("Again in lHM");
        lHM.forEach((k,v) -> System.out.print(k+"-"+v+" "));

    }
}
