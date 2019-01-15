package Chapter14.Task10;

/*Exercise 10, page 562
// Write a program to determine whether an array of char is a primitive type
// or a true Object.*/

public class TestCharObject {
    public static void main(String[] args) {

        char [] chars = new char[5];
        System.out.println(chars.getClass().getName());

        System.out.println( chars instanceof Object);


    }
}
