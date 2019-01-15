package Chapter13.Task7;

/*Exercise 7
/* Using the documentation for java.util.regex.Pattern as a resource,
* write and test a regular expression that checks a sentence to see
* that it begins with a captial letter and ends with a period.*/

public class TestRegexPattern {

    /**/

    public static void main(String[] args) {
        String pattern = "^[A-Z].*[\\.]$";
        String str = "Starts with any capital.";
        String str2 = "starts with any capital.";
        String str3 = "starts with any capital!";

        System.out.println(str.matches(pattern));
        System.out.println(str2.matches(pattern));
        System.out.println(str3.matches(pattern));

    }


}
