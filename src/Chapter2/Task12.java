package Chapter2;
/*Exercise 12: (3) Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift
operator to right shift through all of its binary positions, each time displaying the result using
Integer.toBinaryString( ).*/

public class Task12 {
    public static void main(String[] args) {
        int a = Integer.parseInt("111111",2);
        System.out.println(Integer.toBinaryString(a));

        int steps = Integer.toBinaryString(a).length() -1;

            a <<=steps;
            System.out.println(Integer.toBinaryString(a));

        steps = Integer.toBinaryString(a).length() -1;
        for  (int i=0; i<steps; i++) {

            a >>=1;
            System.out.println(Integer.toBinaryString(a));
        }


    }


}
