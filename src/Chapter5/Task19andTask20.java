package Chapter5;

/*Exercise 19: (2) Write a method that takes a vararg String array. Verify that you can pass either
a comma-separated list of Strings or a String[] into this method.
Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax.
 Print all the elements in the resulting args array. Test it with various numbers of command-line arguments.
*/

public class Task19andTask20 {

    static void method1(String...args) {

        System.out.println("GOOD");
    }

    public static void main(String...args) {

        // args[0] = "Fist";
        // args[1] = "Second";

        String str1 = "str1";
        String str2 = "str2";

        String[] arr = new String[2];

        method1(arr);
        method1(str1, str2);

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
