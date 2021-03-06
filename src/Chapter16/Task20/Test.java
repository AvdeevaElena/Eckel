package Chapter16.Task20;

import java.util.Arrays;

/*Exercise 20, page 778
// Demonstrate deepEquals() for multidimensional arrays.*/

public class Test {
    public static void main(String[] args) {
        int[][][] a1 = new int[4][3][2];
        int[][][] a2 = new int[4][3][2];
        System.out.println(Arrays.deepToString(a1));
        System.out.println(Arrays.deepEquals(a1, a2));
        HaveInt[][][] aa1 = new HaveInt[4][3][2];
        HaveInt[][][] aa2 = new HaveInt[4][3][2];
        System.out.println(Arrays.deepToString(aa1));
        System.out.println(Arrays.deepEquals(aa1, aa2));
        System.out.println(Arrays.deepEquals(a1, aa1));
    }
}
