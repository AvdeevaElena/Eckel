package Chapter18.Task9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/* Exercise 9
// Modify Exercise 8 to force all the lines in the LinkedList to uppercase
// and send the results to System.out..*/

public class CommandLife {

   static String reverseFile (String str) throws IOException {

        String fileName = str;
                //"SomeText.java";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        LinkedList<String> list =new  LinkedList<String>();
        String s;
        while((s = in.readLine()) != null) {
            list.add(s.toUpperCase());
        }
        //System.out.println(list);
        StringBuilder sb = new StringBuilder(); // For output String
        while(list.peekLast() != null)
            sb.append(list.pollLast()+"\n");
        in.close();
        return (sb.toString());

    }


    public static void main(String[] args) throws IOException {

        System.out.print(reverseFile("SomeText.java"));


    }
}
