package Chapter12.Task21;


/* Exercise 1,
/* Create a class with a main(0 that throws an object of class Exception
* inside a try block. Give the constructor for Exception a String argument.
* Catch the exception inside a catch clause and print the String argument.
* Add a finally clause and print a message to prove you were there.*/
public class MyExption extends Exception{
   public MyExption(String strValue) {

       super(strValue);
       System.out.println(" Возбуждаем MyExption из MyExption()");

   }

}
