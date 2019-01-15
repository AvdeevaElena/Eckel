package Chapter4;
/*Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
        where each number (from the third on) is the sum of the previous two. Create a method that takes an integer
        as an argument and displays that many Fibonacci numbers starting from the beginning, e.g.,
        If you run java Fibonacci 5
        (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5. */

public class Task9_Fibonacci {


    public static void fibonacci(int size){

        int prev = 0;
        int next = 1;
        int sum = prev+next;;
        for (int i = prev; i<=size; i++) {

            System.out.print(sum+" ");

            sum = prev+next;
            prev = next;
            next = sum;

        }
    }

    public static void main(String[] args) {

        fibonacci(25);

    }


}

