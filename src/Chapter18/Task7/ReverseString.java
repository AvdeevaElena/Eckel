package Chapter18.Task7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/*Exercise 7
/* Open a text file so that you can read the file one line at a time. Read
* each line as a String and place that String object into a LinkedList.
* Print all of the lines in the LinkedList in reverse order.
*/

public class ReverseString {
    public static void main(String[] args) throws IOException {

        String fileName = "SomeText.java";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        LinkedList<String> list =new  LinkedList<String>();
        String s;
        while((s = in.readLine()) != null) {
            list.add(s);
        }
        //System.out.println(list);
        StringBuilder sb = new StringBuilder(); // For output String
        while(list.peekLast() != null)
            sb.append(list.pollLast()+"\n");
        in.close();
        System.out.println(sb.toString());

    }
}
