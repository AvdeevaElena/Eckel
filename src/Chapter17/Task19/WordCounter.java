package Chapter17.Task19;

/*Exercise 19
// Repeat Exercise 13 using a SimpleHashMap.*/

import java.io.IOException;
import java.util.*;
public class WordCounter {
    public static void main(String[] args) throws IOException {
        // File whose words are to be counted:
        String fileName = "SomeText.java";
        // Set of unique words in file:
        Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
        // Create initialize array of correct length:
        SimpleHashMap<String,Integer> wordCount = new SimpleHashMap<String,Integer>();
        // Word list of all words in file:
        ArrayList<String> fileList = new TextFile(fileName, "\\W+");
        // Count appearances of each unique word and add to array:
        for(String s : words) {
            int count = 0;
            for(String t : fileList) {
                if(t.equals(s)) count++;
            }
            wordCount.put(s, count);
        }
        System.out.println(wordCount);
    }
}
