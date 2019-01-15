package Chapter18.Task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountCharInFile2 {

   static void countMap(String fileName) throws IOException {

        BufferedReader in = new BufferedReader( new FileReader(fileName));
        String str;
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        while ((str = in.readLine()) != null) {
            list.add(str);
            sb.append(str);
        }
        System.out.println(list);
       System.out.println(sb.toString());
       char [] arChar = new char[]{};
       arChar = sb.toString().toCharArray();
       List<Character> list2 = new ArrayList<Character>();

       Set<Character> set = new TreeSet<Character>();
       for(char c : arChar) {
           set.add(c);
           list2.add(c);
       }
       System.out.println(list2);
       System.out.println(set);

       Map<Character, Integer> map = new HashMap<Character, Integer>();

       for (Character  s: set) {
           int aInt = 0;
           for (Character  l:list2) {
               if(s.equals(l)){
                   aInt++;
               }
           }
           map.put(s, aInt);
       }
       System.out.println(map);
    }


    public static void main(String[] args) throws IOException {
        countMap("SomeText.java");

    }
}
