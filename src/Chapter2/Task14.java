package Chapter2;
        /*Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons
        to compare the two Strings and print the results. For the == and !=, also perform the equals( ) test.
        In main( ), call your method with some different String objects.*/

public class Task14 {

    String str1;
    String str2;

    public static void compare (String str1,String str2) {

        System.out.println(str1 == str2 );
        System.out.println(str1 != str2 );
        System.out.println(str1.equals(str2) );
        System.out.println(str2.equals(str1) );

    }

    public static void main(String[] args) {

        String str1 ="abc";
        String str2 ="cba";
        compare(str1,str2);

    }

}

