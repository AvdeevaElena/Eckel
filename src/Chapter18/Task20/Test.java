package Chapter18.Task20;

import Chapter18.Task4.Directory;
import java.io.*;
import static Chapter18.Task20.BinaryFile.read;

/* Exercise 20, page 941
// Using Directory.walk() and BinaryFile, verify that all .class files
// in a directory tree begin with the hex characters 'CAFEBABE'.
*/

public class Test {
    public static void main(String[] args) throws IOException {



        for(File file : Directory.walk(".", ".*\\.class").files) {
            byte[] ba = read(file);


            for(int i = 0; i < 4; i++)
                System.out.println(Integer.toHexString(ba[i] & 0xff).toUpperCase());
            System.out.println();
        }
    }
}
