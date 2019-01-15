package Chapter13.Task6;

import java.util.Formatter;

/* Exercise 6, page 523
/* Create a class that contains int, long, float, and double fields. Create
* a toString() method for this class that uses String.format(), and demonstrate
* that your class works correctly.*/

public class Test {

    Formatter f = new Formatter(System.out);

    double aDouble = 3.14;
    int anInt= 5;
    long aLong = 50000;
    float aFloat = 3.1434f;

    @Override
    public String toString() {
        String str =null;
        str = String.format("anInt - %d\n aDouble - %.2f\n aLong = %d\n aFloat - %f ", anInt, aDouble,aLong, aFloat );
        return str;
    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.toString() );
    }
}
