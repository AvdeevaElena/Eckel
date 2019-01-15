package Chapter13.Task20;

/*Exercise 20
/* Create a class that contains int, long, float and double and String fields.
* Create a constructor for this class that takes a single String argument, and
* scans that string into the various fields. Add a toString(0 method and
* demonstrate that your class works correctly.*/

import java.util.Scanner;

public class ScannerTest {

    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    String str;

    ScannerTest (String strValue) {
        Scanner scanner = new Scanner(strValue);
        anInt = scanner.nextInt();
        aLong = scanner.nextLong();
        aFloat = scanner.nextFloat();
        aDouble = scanner.nextDouble();
        str = scanner.next();
    }

    public static void main(String[] args) {
        ScannerTest r = new ScannerTest("100 2L 3.14f 4.14 java");
        System.out.println(r);
    }

    @Override
    public String toString() {
        return anInt + " " + aLong+" "+ aFloat+" "+aDouble+" "+str;
    }
}
