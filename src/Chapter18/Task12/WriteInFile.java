package Chapter18.Task12;

// Exercise 12,
/* Modify Exercise 8 to also open a text file so you can write text into it.
* Write the lines in the LinkedList, along with line numbers (do not attempt
* to use the "LineNumber" classes), out to the file.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class WriteInFile {

    public static void ReadAndWriteFromToFile(String fromFile, String inFile   ) throws IOException {


        String filefrom = fromFile;
        BufferedReader in = new BufferedReader(new FileReader(filefrom));

        String fileIN = inFile;
        PrintWriter out = new PrintWriter(fileIN);


        LinkedList<String> list = new LinkedList<String>();

        String what;
        StringBuilder sb = new StringBuilder();
        while ((what = in.readLine()) != null) {
            list.add(what);
        }
        while (list.peekLast() !=null) {
            sb.append(list.pollLast()+"\n");
            out.println(sb.toString());
        }
        in.close();
        out.close();
    }
    public static void main(String[] args) throws IOException {

        ReadAndWriteFromToFile("SomeText.java","Reversed.java");
    }
}
