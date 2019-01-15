package Chapter5;

        //Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message.
        //Create an object of this class.

public class Task3 {

    Task3(){

        System.out.println("Я конструктор о умолчанию");
    }


    public static void main(String[] args) {

        Task3 test = new Task3();
        System.out.println(test);

    }
}
