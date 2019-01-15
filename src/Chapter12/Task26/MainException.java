package Chapter12.Task26;

import java.io.FileInputStream;

// Exercise 26:
// Change the file name string in MainException.java to name a file that doesn’t exist. Run the program
// * and note the result.

public class MainException {

    public static void main(String[] args) throws Exception {
        // Leads to FileNotFoundException:
        FileInputStream file = new FileInputStream("null.jv");

        file.close();
    }
}
