package Chapter13.Task19;

/*Exercise 19
/* Building on the previous two exercises, write a program that examines
* Java source-code and produces all the class names used in a particular
* program.*/

import Chapter11.Task20.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileClassName {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: fileName");
            System.exit(0);
        }
        // we want all class names:
        Pattern p = Pattern.compile("class \\w+\\s+");
        // not including those in comment lines:
        Pattern q = Pattern.compile("^(//|/\\*|\\*)");
        System.out.println("classes in " + args[0] + ":");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); // creates emtpy Matcher object
        Matcher n = q.matcher("");
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            n.reset(line);
            while(m.find() && !n.find())
                System.out.println(index++ + ": " + m.group());
        }
    }
}
