package Chapter1;
/*Exercise 9: (2) Write a program that demonstrates that autoboxing works for
        all the primitive types and their wrappers*/


public class task9_2 {

    public static void giveType (Integer integer) {
        System.out.println("It's is Integer");
    }
    public static void main(String[] args) {
        Integer integer = new Integer(7); // 1 vareant
        Double aDouble = new Double(2.0);

        giveType(99);   // 2 vareant

    }


}
