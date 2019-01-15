package Chapter18.Task28;

/*Exercise 28,
/* In Blips.java, copy the file and rename it to BlipCheck.java and
* rename the class Blip2 to BlipCheck (making it public and removing
* the public scope from the class Blips in the process). Remove the
* //! marks in the file and execute the program, including the offending
* lines. Next, comment out the default constructor for BlipCheck. Run
* it and explain why it works. Note that after compiling, you must
* execute the program with "java Blips" because the main() methon is
* still in the class Blips.*/

import java.io.*;

public class Blips {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        System.out.println("Constructing objects:");
        Blip b1 = new Blip();
        Blip b2 = new Blip();
        BlipCheck bc = new BlipCheck();
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Blips.out"));
        System.out.println("Saving objects:");
        o.writeObject(b1);
        o.writeObject(b2);
        o.writeObject(bc);
        o.close();
        // Now get them back:
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Blips.out"));
        System.out.println("Recovering b1:");
        b1 = (Blip)in.readObject();
        System.out.println("Recovering b2:");
        b2 = (Blip)in.readObject();
        System.out.println("Recovering bc:");
        bc = (BlipCheck)in.readObject();
    }
}