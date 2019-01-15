package Chapter11.Task22;

import Chapter11.Task20.TextFile;

import java.io.IOException;
import java.util.*;

/*Exercise 22, page422
/* Modify the previous exercise so that it uses a class containing a String and
* a count field to store each different word, and a Set of these objects to
* maintain the list of words.*/
public class UniqueWords {
    public static void main(String[] args) throws IOException {
        List<String> list = new TextFile("SomeText.java", "\\W+");

        Map<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String string : list) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        System.out.println(map);

        Set<StringCount> set = new TreeSet<>();
        for (String string : list) {
            StringCount sc = containsWord(set, string);
            if (sc == null) {
                sc = new StringCount(string);
                set.add(sc);
            } else {
                sc.addCount();
            }
        }
        System.out.println(set);
    }

    private static StringCount containsWord(Set<StringCount> set, String string) {
        StringCount stringCount = null;
        for (StringCount sc : set) {
            if (sc.getWord().equals(string)) {
                stringCount = sc;
            }
        }
        return stringCount;
    }
}
