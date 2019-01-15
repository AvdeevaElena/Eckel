package Chapter17.Task3;

/*Exercise 3
/* Using Countries, fill a Set multiple times with the same data
* and verify that the Set ends up with only one of each instance.
* Try this with HashSet, LinkedHashSet, and TreeSet.*/

import java.util.*;
import java.util.regex.Pattern;

public class TestSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<String>();
        Set<String> llSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>();

        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");

        Map<String, String> cMap = new HashMap<String, String>();
        for (int  i =0; i< Countries.DATA.length; i++ ){
            if(pattern.matcher(Countries.DATA[i][0]).matches()) {
                cMap.put(Countries.DATA[i][0],Countries.DATA[i][1]);
            }
        }
        hashSet.addAll(cMap.keySet());
        System.out.println(hashSet);
        llSet.addAll(cMap.keySet());
        System.out.println(llSet);
        treeSet.addAll(cMap.keySet());
        System.out.println(treeSet);
    }

}
