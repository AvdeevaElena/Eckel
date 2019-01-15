package Chapter13.Task10;

/*Exercise 10
/* For the phrase "Java now has regular expressions" evaluate whether the following
* expressions will find a match:
* 	^Java
* 	\Berg.*
*	n.w\s+h(a|i)s
*	S?
*	S+
*	s{4}
*	s{1}.
* 	s{0,3}
*/

public class TestRegularExpression {

    public static void main(String[] args) {
        String  str = "Java now has regular expressions";

        System.out.println( str.matches("^Java") );
        System.out.println( str.matches("\\Berg.*") );
        System.out.println( str.matches("n.w\\s+h(a|i)s") );
        System.out.println( str.matches("S?") );
        System.out.println( str.matches("S+") );
        System.out.println( str.matches("s{4}") );
        System.out.println( str.matches("s{1}.") );
        System.out.println( str.matches("s{0,3}") );
    }
}
