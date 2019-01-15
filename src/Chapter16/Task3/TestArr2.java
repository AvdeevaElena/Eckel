package Chapter16.Task3;

import java.util.Arrays;

public class TestArr2 {

    static double[][] createArr(int size, int size2, double start, double end ) {

        if (end <= start) System.out.println("Enter another diapozone");

        double[][] arr = new double[size][size2];

        for (int i= 0;i < arr.length; i++){
            System.out.println();
            for (int y = 0;y<arr[i].length; y++) {
                 arr[i][y] = Math.random() * (end-start)+start;
            }
        }

         return  arr;
    }

    static void printArray(double[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }



    public static void main(String[] args) {
     //   System.out.println(Arrays.asList(createArr(2,3, 4,5)));
        printArray(createArr(3,5, -4,5));
    }
}
