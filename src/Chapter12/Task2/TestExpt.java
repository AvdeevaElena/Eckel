package Chapter12.Task2;


/*Exceptions, Exercise 2, page 452
/* Define an object reference and initialize it to null. Try to call a method
* through this reference. Now wrap the code in a try-catch clause to catch the
* exception.*/

public class TestExpt {

    static Integer value = null;

    public static void main(String[] args) {

        System.out.println(value.toString());

        try{ System.out.println(value.toString());}

        catch (NullPointerException e) {e.printStackTrace();}

         try {value =10;   System.out.println(value.toString());}

        catch (NullPointerException e) {e.printStackTrace();}

        finally {
             System.out.println("Finally Block");
         }
    }
}
