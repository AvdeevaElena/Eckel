package Chapter18.Task21;

import java.io.*;


/*Exercise 21
/* Write a program that takes standard input and capitalizes all
* characters, then puts the results on standard output. Redirect
* the contents of a file into this program (the process of redirection
* will vary dependign on your operating system).*/

public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("Ex21.java");
        BufferedInputStream inFile =
                new BufferedInputStream(new FileInputStream(file));
        System.setIn(inFile);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null)
            System.out.println(s.toUpperCase());
    }
}

