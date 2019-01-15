package Chapter4;

import java.util.Random;

        // Modify Exercise 2 so that your code is surrounded by an “infinite” while loop.
        // It will then run until you interrupt it from the keyboard (typically by pressing Control- C).

public class Task3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int value_prev =  rand.nextInt(1)+100;
        System.out.println( value_prev);
        int value_next;

        while (true) {
            int randomNumber = rand.ints(1, 0, 101).findFirst().getAsInt();
            value_next = randomNumber;
            if (value_prev > value_next) System.out.println(value_prev + " > " + value_next);
            if (value_prev < value_next) System.out.println(value_prev + " < " + value_next);
            if (value_prev == value_next) System.out.println(value_prev + " = " + value_next);

            value_prev = value_next;

        }

        }
}
