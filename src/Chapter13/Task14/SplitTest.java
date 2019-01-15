package Chapter13.Task14;


/*Exercise 14,
// Rewrite SplitDemo using String.split().*/


import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {

        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));

    }
}
