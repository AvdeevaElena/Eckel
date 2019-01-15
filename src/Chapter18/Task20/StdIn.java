package Chapter18.Task20;

import java.io.*;

/* Exercise 20, page 941
// Using Directory.walk() and BinaryFile, verify that all .class files
// in a directory tree begin with the hex characters 'CAFEBABE'.
*/

public class StdIn {
    public static void main(String[] args) throws IOException {
        File file = new File("SomeText.java");
        BufferedInputStream inFile = new BufferedInputStream(new FileInputStream(file));
        System.setIn(inFile);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null)
            System.out.println(s.toUpperCase());
    }
}