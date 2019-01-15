package Chapter18.Task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CommandLife {

   static String reverseFile (String str) throws IOException {

        String fileName = str;
                //"SomeText.java";
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
        return (sb.toString());

    }


    public static void main(String[] args) throws IOException {

        System.out.print(reverseFile("SomeText.java"));

        if(args.length != 1) {
            System.out.println("File name");
            System.exit(1);
        }
        System.out.print(reverseFile(args[0]));
    }
}
