package Chapter4;

/*Exercise 8: (2) Create a switch statement that prints a message for each case, and put the switch inside a for loop
that tries each case. Put a break after each case and test it, then remove the breaks and see what happens.*/

public class Task8 {

    public static void main(String[] args) {

        for (int i =0; i<=4; i++) {

            switch (i) {
                case (2):
                    System.out.println(2); break;
                case (3):
                    System.out.println(3); break;

                    default:  System.out.println(1 + " или "+ 4);
            }

        }
    }
}
