package Chapter5;
/*Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition, and another
 one that is initialized by the static block.
 Add a static method that prints both fields and demonstrates that they are both initialized before they are used.*/

public class Task14 {

    static String str ="String";
    static String str2;

    static {
        String strBlock ="StringBlock";
        str2 ="Block";
    }

    static void test() {
        System.out.println(str);
        System.out.println(str2);

    }

    public static void main(String[] args) {

        test();


    }
}
