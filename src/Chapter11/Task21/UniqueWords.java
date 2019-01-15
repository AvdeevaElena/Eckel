package Chapter11.Task21;

import Chapter11.Task20.TextFile;

import java.io.IOException;
import java.util.*;
/*Exercise 21
/* Using a Map<String,Integer>, follow the form of UniqueWords.java to create a
* program that counts the occurrence of words in a file. Sort the results using
* Collections.sort() with a second argument of String.CASE_INSENSITIVE_ORDER (to
* produce an alphabetic sort), and display the result.*/

public class UniqueWords {
    public static void main(String[] args) throws IOException {
        List<String> list = new TextFile("SomeText.java", "\\W+");
        System.out.println(list);
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        int totalCount = 0;

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().toString();
            if (list.contains(str)) {
                Integer count = map.get(str);
                map.put(str,
                        count == null ? 1 : count + 1);
                totalCount++;
            }
        }
        System.out.println(map);
        System.out.println(totalCount);
    }

}