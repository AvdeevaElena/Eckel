package Chapter5;

// Exercise 1: (1) Create a class containing an uninitialized String reference.
// Demonstrate that this reference is initialized by Java to null.

public class Task1 {


    String name;

    public static void main(String[] args) {

        Task1 test = new Task1();
        System.out.println(test.name);

    }
}
