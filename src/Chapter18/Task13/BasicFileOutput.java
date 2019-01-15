package Chapter18.Task13;

/*t13.java
// TIJ4 Chapter IO, Exercise 13
/* Modify BasicFileOutput.java so that it uses LineNumberReader to keep
* track of the line count. Note that it's much easier to just keep track
* programmatically.*/

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class BasicFileOutput {

    public static void main(String[] args) throws IOException {

        String file = "SomeText.java";
        LineNumberReader in = new LineNumberReader(
                new FileReader(file));
        PrintWriter out = new PrintWriter(file);
        String s;
        while((s = in.readLine()) != null )
            out.println(in.getLineNumber() + ": " + s);
        out.close();
    }
}
