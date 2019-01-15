package Chapter13.Task12;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupsTest {
    public static String poem = "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch,\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {


        Matcher m = Pattern.compile("(^[a-z] |\\s+[a-z])\\w+").matcher(poem);
        Set<String> treeSet = new TreeSet<String>();
        while(m.find()) {
            treeSet.add(m.group());
        }
        System.out.println(treeSet.size());
        System.out.println(treeSet);

    }
}
