package Chapter18.Task29;

import java.io.*;

/*Excercise 29
// In Blip29.java, comment out the two lines after the phrases "You must
// do this:" and run the program. Explain the result and why it differs
// from when the two lines are in the program.*/

public class Blip implements Externalizable {
    private int i;
    private String s; // No initialization
    public Blip() {
        System.out.println("Blip Contstructor");
        // s, i not initialized
    }
    public Blip(String x, int a) {
        System.out.println("Blip29(String x, int a)");
        s = x;
        i = a;
    }
    public String toString() { return s + i; }
    public void writeExternal(ObjectOutput out)
            throws IOException {
        System.out.println("Blip29.writeExternal");
    }
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        System.out.println("Blip29.readExternal");
        // You must do this:
        // (or else dafault constructor will automatically
        // initialize fields to default values)
        // s = (String)in.readObject();
        // i = in.readInt();
        // or i = (Integer)in.readObject();
    }
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        System.out.println("Constructing objects:");
        Blip b = new Blip("A String ", 47);
        System.out.println(b);
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Blip.out"));
        System.out.println("Saving object:");
        o.writeObject(b);
        o.close();
        // Now get it back:
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Blip.out"));
        System.out.println("Recovering b:");
        b = (Blip)in.readObject();
        System.out.println(b);
    }
}

