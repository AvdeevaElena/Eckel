package Chapter4;

//Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.
public class Task7 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int y=0;

        for (int i=1; i<=arr.length; i++) {
            arr[y] = i;

            if (arr[y] == 99 ) break;
            System.out.print(arr[y]+" ");
            y+=1;
        }

        System.out.println();

        // или так
        for (int i = 1; i < 101; i++) {

            if (i == 99 ) return;

            System.out.print(i + " ");

        }

    }

}
