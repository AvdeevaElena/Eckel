package Chapter2;

/*Exercise 11: (3) Start with a number that has a binary one in the most significant position
(hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift it all
 the way through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).*/

public class task11 {
    public static void main(String[] args) {

        int a = Integer.parseInt("101000", 2);
        System.out.println(Integer.toBinaryString(a)+"l ="+Integer.toBinaryString(a).length());

        int steps = Integer.toBinaryString(a).length() -1;
        System.out.println("steps are "+steps );

        for (int i = 0; i <steps; i++) {

            a >>= 1;
            System.out.println(Integer.toBinaryString(a));
        }


    }
}

