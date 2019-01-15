package Chapter6.Task8;
/*Exercise 8: (4) Following the form of the example Lunch.java, create a class called ConnectionManager
 that manages a fixed array of Connection objects.
 The client programmer must not be able to explicitly create Connection objects,
 but can only get them via a static method in ConnectionManager.
 When the ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).*/

public class ConnectionManager {

   // Connection [] arrConnection = new Connection[4];
   private  static Connection [] arrConnection = {Connection.makeConnection(), Connection.makeConnection(), Connection.makeConnection() };

   static  int count = 0;

   static Connection ManageConnection() {

       if (count < arrConnection.length) {return arrConnection[count++]; }
       else return null;
    }


    public static void main(String[] args) {

        System.out.println( ManageConnection());
        System.out.println( ManageConnection());
        System.out.println( ManageConnection());
        System.out.println( ManageConnection());
        System.out.println( ManageConnection());
    }

}
