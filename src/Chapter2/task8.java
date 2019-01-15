package Chapter2;
/*Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.*/

public class task8 {
    public static void main(String[] args) {


        int iHex = 0x22f; // Hexadecimal (lowercase)
        int iIHex = 0x22F; // Hexadecimal (uppercase)
        int iOct = 0122;// Octal (leading zero)

        System.out.println(iHex+" "+ iIHex +" "+ iOct);

        long example =iHex;

        System.out.println(Long.toBinaryString(iHex));
        example =iIHex;
        System.out.println(example);
        example =iOct;
        System.out.println(example);
    }

}
