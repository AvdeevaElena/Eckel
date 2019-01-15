package Chapter11.Task25;


import Chapter11.Task20.TextFile;

import java.io.IOException;
import java.util.*;

/*Exercise 25, page 423
/* Create a Map<String, ArrayList<Integer>>. Use net.mindview.TextFile
* to open a text file and read it in a word at a time (use "\\W+\" as
* the second argument to the TextFile constructor). Count the words as
* you read them in, and for each word in the file, record in the
* ArrayList<Integer> the word count associated with that word - that is,
* in effect, the location in the file where that word was found.*/
public class MapWords {
    public static void main(String[] args) {


        Map<String, ArrayList<Integer>> map = new TreeMap<String, ArrayList<Integer>>();
        List<String> list = new LinkedList<String>();
        try {
            list.addAll(new TextFile("SomeText.java", "\\W+"));
            System.out.println(list);
            Iterator<String> it = list.iterator();
            int totalCount = 0;
            while (it.hasNext()) {
                String str = it.next().toString();
                totalCount++;
                if(! map.keySet().contains(str)){
                    ArrayList<Integer> arr =new ArrayList<Integer>();
                    arr.add(0, totalCount);
                    map.put(str,arr);
                }
                else {
                    map.get(str).add( totalCount);
                    map.put(str, map.get(str));
                }
            }
            System.out.println(map);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
