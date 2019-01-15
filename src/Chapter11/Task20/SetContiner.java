package Chapter11.Task20;


import java.io.IOException;
import java.util.*;


/* Exercise 20: Modify Exercise 16 so that you keep a count of the occurrence of each vowel*/
public class SetContiner {
    public static void main(String[] args) throws IOException {

        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        map.put('A', 1);
        map.put('E', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('U', 1);

        List<String> list = new TextFile("SomeText.java", "\\W+");
        int totalCount = 0;
        for (String str: list) {
            int count = 0;
            char [] charArr = str.toLowerCase().toCharArray();
            for (char c : charArr) {
                if (map.keySet().contains(c)) {
                    count++;
                    totalCount++;
                }
                totalCount += count;
            }
                System.out.println(str.toUpperCase() + " содержит " + count + " гл.");
        }
        System.out.println("Весь Текст содержит " + totalCount + " гласных.");
        System.out.println(map.keySet());
    }
}
