package Chapter17.Task2;

/*Exercise 2
// Produce a Map and a Set containing all the countries that begin
// with 'A'.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class TestA {
    public static void main(String[] args) {

        Map<String, String> mapA= new HashMap<String,String>();
        Set<String> set = mapA.keySet();

        Pattern pattern = Pattern.compile("A[a-zA-Z]*");
        for (int  i =0; i< Countries.DATA.length; i++ ){
            if (pattern.matcher(Countries.DATA[i][0]).matches()){
                mapA.put(Countries.DATA[i][0],Countries.DATA[i][1]);
            }
        }

        System.out.println(mapA);
        System.out.println(set);
    }
}
