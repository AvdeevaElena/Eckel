package Chapter18.Task14;

import java.io.*;

/* Exercise 14
// Starting with BasicFileOutput.java, write a program that compares the
// performance of writing to a file when using buffered and unbuffered I/O.*/


public class Test {
    static String fileIn = "SomeText.java";
    static String fileOut = "Reversed.java";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader( new FileReader(fileIn));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileOut)));
        int lineCount = 1;
        String s;

        long start = System.nanoTime();
        while((s = in.readLine()) != null )
            out.println(lineCount++ + ": " + s);
        long duration = System.nanoTime() - start;
        out.close();
        System.out.println("Buffered write:   " + duration + " nanoseconds");
        BufferedReader in2 = new BufferedReader(new FileReader(fileIn));
        // Unbuffered writer:
        PrintWriter out2 = new PrintWriter(new FileWriter(fileOut));
        int lineCount2 = 1;
        String s2;
        long start2 = System.nanoTime();
        while((s2 = in2.readLine()) != null )
            out2.println(lineCount2++ + ": " + s2);
        long duration2 = System.nanoTime() - start2;
        out2.close();
        System.out.println("Unbuffered write: " + duration2 + " nanoseconds");

    }
}
