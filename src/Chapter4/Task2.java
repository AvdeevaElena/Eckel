package Chapter4;
    //    Exercise 2: (2) Write a program that generates 25 random int values. For each value, use an if-else statement
     //   to classify it as greater than, less than, or equal to a second randomly generated value.


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int value_prev =  rand.nextInt(1)+100;
        System.out.println( value_prev);
        int value_next;

        for (int i=0; i<13; i++) {
            int randomNumber = rand.ints(1, 0, 101).findFirst().getAsInt();
            value_next = randomNumber;
            if (value_prev > value_next) System.out.println( value_prev +" > "+ value_next);
            if (value_prev < value_next) System.out.println( value_prev +" < "+ value_next);
            if (value_prev == value_next) System.out.println( value_prev +" = "+ value_next);

            value_prev = value_next;



        }
    }
}
