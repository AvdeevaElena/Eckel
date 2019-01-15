package Chapter18.Task19;

import java.io.*;
import java.util.*;


/*Exercise 19, page 941
// 19 Using BinaryFile and a Map<Byte,Integer>, create a program that
// counts the occurrence of all the different bytes in a file.*/

public class BinaryCount {
    public static void count(String fName) throws IOException {

        String fileName = fName;
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(fileName));

        try {

            byte[] ba = new byte[bf.available()];
            Set<Byte> byteSet = new TreeSet<Byte>();
            for(Byte b : ba) byteSet.add(b);

            List<Byte> byteList = new ArrayList<Byte>();
            for(byte b : ba) byteList.add(b);
            Map<Byte,Integer> byteMap = new HashMap<Byte,Integer>();
            for(Byte b : byteSet) {
                int count = 0;
                for(Byte d : byteList) {
                    if(d.equals(b)) count++;
                }
                byteMap.put(b, count);
            }
            System.out.println();
            System.out.println(byteMap);
        } catch(IOException e) {
            System.err.print("Caught " + e);
        }
    }


    public static void main(String[] args) throws IOException {
        count("SomeText.java");
    }
}
