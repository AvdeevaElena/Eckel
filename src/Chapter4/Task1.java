package Chapter4;
// Exercise 1: (1) Write a program that prints values from 1 to 100.
public class Task1 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int y=0;

        for (int i=1; i<=arr.length; i++) {
            arr[y] = i;
            System.out.print(arr[y]+" ");
            y+=1;
        }


        System.out.println();
        // или так
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");

    }

    }
}
