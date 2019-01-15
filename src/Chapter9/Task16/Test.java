package Chapter9.Task16;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        Scanner s = new Scanner(new RandomChars(5));
        while(s.hasNext())
            System.out.print(s.next() + " ");
    }
}
