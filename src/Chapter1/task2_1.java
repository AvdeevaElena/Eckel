package Chapter1;
// Exercise 1: (2) Create a class containing an int and a char that are not initialized,
// and print their values to verify that Java performs default initialization

public class task2_1 {

    static  int  class_int;
    static char class__char;

    public static void main(String [] args) {

        System.out.println("Class "+ class_int + " " + class__char );

       int  local_int =0;            // Инициализация обязательна!!!
       char local__char ='a';

        System.out.println("LOCAL "+ local_int + " " + local__char );


    }


}
