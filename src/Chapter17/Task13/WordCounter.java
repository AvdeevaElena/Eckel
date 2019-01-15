package Chapter17.Task13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import java.util.*;
public class WordCounter {

    public static void main(String[] args) throws IOException {
        // File whose words are to be counted:
        String fileName = "SomeText.java";
        // Set of unique words in file:
        Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
        // Create initialize array of correct length:
        Map<String,Integer> wordCount = new TreeMap<String,Integer>();
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
