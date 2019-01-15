package Chapter11.Task26;


import Chapter11.Task20.TextFile;

import java.io.IOException;
import java.util.*;

/*Exercise 26, page 423
/* Take the resulting Map from the previous exercise and re-create the
* order of the words as they appeared in the original file.*/
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

            System.out.println("Recreating the order of the words");
            Map<Integer,String> replay = new TreeMap<Integer,String>();
            Iterator<Map.Entry<String,ArrayList<Integer>>> itR = map.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry<String, ArrayList<Integer>> me = itR.next();
                for (int i = 0; i < me.getValue().size(); i++)
                    replay.put(me.getValue().get(i),
                            me.getKey());
                System.out.println();
                System.out.println("TreeMap of ordered locations, words: " + replay);
                System.out.println();
                System.out.println("Words in original order: " + replay.values());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
