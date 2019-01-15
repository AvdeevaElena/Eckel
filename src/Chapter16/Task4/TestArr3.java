package Chapter16.Task4;

import java.util.Arrays;

public class TestArr3 {
    static double[][][] createArr(int size, int size2,int size3, double start, double end ) {

        if (end <= start) System.out.println("Enter another diapozone");

        double[][][] arr = new double[size][size2][size3];

        for (int i= 0;i < arr.length; i++){
            for (int y = 0;y<arr[i].length; y++) {
                for (int j = 0;j<arr[i][y].length; j++) {
                    arr[i][y][j] = Math.random() * (end - start) + start;
                }
            }
        }

        return  arr;
    }

    static void printArray(double[][][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }



    public static void main(String[] args) {
        //   System.out.println(Arrays.asList(createArr(2,3, 4,5)));
        printArray(createArr(3,5,2, -4,5));
    }
}
