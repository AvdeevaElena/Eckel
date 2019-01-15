package Chapter17.Task27;

//Exercise 27
/* Modify the hashCode() in CountedString.java by removing the combination
* with id, and demonstrate that CountedString still works as a key. What
* is the problem with this approach?*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountedString {

    private static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0;
    private char c;

    public CountedString(String str, char ch) {
        s = str;
        c = ch;
        created.add(s);
        for(String s2 : created)
            if(s2.equals(s)) id++;
    }
    public String toString() {
        return "String: " + s + " id: " + id + ", c: " + c  +
                ", hashCode(): " + hashCode();
    }
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
       // result = 37 * result + id;
        result = 37 * result + c;
        return result;
    }
    public boolean equals(Object o) {
        return o instanceof CountedString &&
                s.equals(((CountedString)o).s) &&
                id == ((CountedString)o).id &&
                c == ((CountedString)o).c;
    }
    public static void main(String[] args) {
        Map<CountedString,Integer> map = new HashMap<CountedString,Integer>();
        CountedString[] cs = new CountedString[5];
        for(int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi", 'x');
            map.put(cs[i], i); // Autobox int -> Integer
        }
        System.out.println(map);
        for(CountedString cstring : cs) {
            System.out.println("Result " + cstring);
            System.out.println(map.get(cstring));
        }

    }
}
