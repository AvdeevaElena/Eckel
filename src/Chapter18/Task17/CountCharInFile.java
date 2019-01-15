package Chapter18.Task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountCharInFile {



    public static void main(String[] args) throws IOException {
        String fileName = "SomeText.java";
        BufferedReader in = new BufferedReader(new FileReader(fileName));

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        LinkedList<String> list = new LinkedList<String>();
        String s;
        char[] arrChar = new char[0];
        while ((s = in.readLine()) != null) {
            list.add(s);
        }
        in.close();
        System.out.println("LIST");
        System.out.println(list);
        System.out.println(list.size());
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            // System.out.println(it.next());
            sb.append(it.next().toCharArray());
        }
        arrChar = sb.toString().toCharArray();
        System.out.println(arrChar.length);

        Set<Character> set = new TreeSet<Character>();
        for(char c : arrChar) set.add(c);

        List<Character> list2 = new ArrayList<Character>();
        for(char c : arrChar) list2.add(c);
        System.out.println("List2"+list2);


        for (Character sh: set) {
                int aVal = 0;
            for (Character l: list2) {
                 if (sh.equals(l)) {
                     aVal++;

                 }
            }
            map.put(sh,aVal);
        }

        System.out.println(map);

    }

    }
