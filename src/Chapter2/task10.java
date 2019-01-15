package Chapter2;
/*Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes,
 with a zero in the least-significant digit, and the second, also alternating, with a one in the least-significant
  digit (hint: It’s easiest to use hexadecimal constants for this). Take these two values and combine them
 in all possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ).*/

public class task10 {

    public static void main(String[] args) {
       final int CONST_ValLeft = Integer.parseInt("0101", 2);;
       final int CONST_ValRiht = Integer.parseInt("1010", 2);

        System.out.println(CONST_ValLeft + "  " + CONST_ValRiht);
        System.out.println(Integer.toBinaryString(CONST_ValLeft));
        System.out.println(Integer.toBinaryString(CONST_ValRiht));

        System.out.println (Integer.toBinaryString(CONST_ValLeft ^ CONST_ValRiht));
        System.out.println (Integer.toBinaryString(CONST_ValLeft & CONST_ValRiht));
        System.out.println (Integer.toBinaryString(CONST_ValLeft | CONST_ValRiht));
        System.out.println (Integer.toBinaryString(~ CONST_ValRiht));
        System.out.println (Integer.toBinaryString(~ CONST_ValLeft));
    }
}
