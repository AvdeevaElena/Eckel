package Chapter16.Task5;

import java.util.Arrays;

//Exercise 5
// Demonstrate that multidimensional arrays of non-primitives are
// automatically initialized to null.
//

public class TestObj {
    public static void main(String[] args) {

        Animal[][] anArr = new Animal[2][3];
        System.out.println(Arrays.deepToString(anArr));

    }
}
