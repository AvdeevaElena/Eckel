package Chapter11.Task16;


import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/*Exercise 16: Create a Set of the vowels. Working from UniqueWords.Java, count and display the number of vowels in
 * each input word, and also display the total number of vowels in the input file.*/
public class SetContiner {
    public static void main(String[] args) throws IOException {

        Set<Character> set = new TreeSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        Collections.addAll(set, 'A','E','I','O','U');

        List<String> list = new TextFile("SomeText.java", "\\W+");
        int totalCount = 0;
        for (String str: list) {
            int count = 0;
            char [] charArr = str.toLowerCase().toCharArray();
            for (char c : charArr) {
                if (set.contains(c)) {
                    count++;
                    totalCount++;
                }
                totalCount += count;
            }
                System.out.println(str.toUpperCase() + " содержит " + count + " гл.");
        }
        System.out.println("Весь Текст содержит " + totalCount + " гласных.");
        System.out.println(set);
    }
}
