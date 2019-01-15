package Chapter18.Task27;


/*Exercise 27
/* Create a Serializable class containing a reference to an object of a
* second Serializable class. Create an instance of your class, serialize it
* to disk, then restore it and verify that the process worked correctly.*/

import java.io.*;
import java.util.Random;

public class SerializationTest  implements Serializable {
    private static Random rand = new Random();
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        B b = new B('x', new A(rand.nextInt(100)));
        System.out.println("b: " + b);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("STest.out"));
        out.writeObject(b);
        out.close();
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("STest.out"));
        B b2 = (B)in.readObject();
        System.out.println("b2: " + b2);
    }
}