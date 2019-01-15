package Chapter13.Task11;

/*Exercise 11, page 533
/* Apply the regular expression
*	(?i)((^[aeiou])|(\\s+[aeiou]))\\w+[aeiou]\\b
* 	to
*	Arline ate eight apples and one orange while Anita hadn't any*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {


        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+[aeiou]\\b");
        Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any");
        while(m.find())
            System.out.println( m.group() + "==>" + m.start());
    }

}

