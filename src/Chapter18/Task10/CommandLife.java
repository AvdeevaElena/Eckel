package Chapter18.Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Exercise 10, page 928
// Modify Exercise 8 to take additional command-line arguments of words to
// find in the file. Print all lines in which any of the words match.*/

public class CommandLife {

    static String reverseFile (String str, String findWord) throws IOException {

        String fileName = str;
        //"SomeText.java";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        LinkedList<String> list =new  LinkedList<String>();
        List<String> find = new ArrayList<String>();
        find.add(findWord);
        String s;
        while((s = in.readLine()) != null) {
            List<String> line = Arrays.asList(s.split("\\W+"));
            if(!(Collections.disjoint(line, find)))
                list.add(s); // Add to list
        }
        //System.out.println(list);
        StringBuilder sb = new StringBuilder(); // For output String
        while(list.peekLast() != null)
            sb.append(list.pollLast()+"\n");
        in.close();
        return (sb.toString());

    }


    public static void main(String[] args) throws IOException {

        System.out.print(reverseFile("SomeText.java","the"));


    }
}
