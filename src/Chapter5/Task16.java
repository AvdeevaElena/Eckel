package Chapter5;
/*Exercise 16: (1) Create an array of String objects and assign a String to each element.
 Print the array by using a for loop.*/

public class Task16 {

    public static void main(String[] args) {

        String [] arr =new String[3];
        arr[0]="zero";
        arr[1]="one";
        arr[2]="two";



        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
