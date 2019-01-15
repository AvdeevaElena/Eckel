package Chapter5.Task5andTask6andTask7;


/*Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on
        various primitive data types, and print different types of barking, howling, etc.,
        depending on which overloaded version is called. Write a main( ) that calls all the different versions.*/


public class Dog {


    public static void bark(int i) { System.out.println( "Barking"); }
    public static void bark(char c) { System.out.println( "Howling"); }
    public static void bark(String str) { System.out.println( "Etc.,"); }


    public static void bark(int i,char c) { System.out.println( "Barking and Howling" ); }
    public static void bark(char c, int i) { System.out.println( "Howling and Barking"); }


}

