package Chapter13.Task9;

//Exercise 9
// Using the documentation for java.util.regex.Pattern as a resource,
// replace all the vowels in Splitting.knights with underscores.

public class TestRegexPattern {

    public static void main(String[] args) {

        String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest.with... a herring!";

        System.out.println( knights.replaceAll("e|y|a|o|u|i" , "*"));

    }
}
