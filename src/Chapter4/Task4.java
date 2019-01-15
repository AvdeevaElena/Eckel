package Chapter4;

/*     Exercise 4: (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime
        numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1). */

public class Task4 {
    public static void main(String[] args) {

        int simpleNumber;
        boolean isSN;
        for (int i =1; i<121; i++) {
            isSN =true;
            for (int y =2; y < i; y++) {

                if (i % y == 0) isSN = false; break;
            }

            if (isSN) {
                simpleNumber = i;
                System.out.print(simpleNumber+ " ");
            }
        }

    }


}
