package Chapter18.Task4;

import java.io.File;
/*Exercise 4
// Use Directory.walk() to sum the sizes of all files in a directory
// tree whose names match a particular regular expression.*/


public class CalcSize {
    public static void main(String[] args) {
        long sum = 0;
        if(args.length == 0) {
            for(File file : Directory.walk(".").files) {
                System.out.print(file + ": ");
                System.out.println(file.length());
                sum += file.length();
            }

        }
        else
            for(String arg : args) {
                {
                    for(File file : Directory.walk(".", arg).files) {
                        System.out.print(file + ": ");
                        System.out.println(file.length());
                        sum += file.length();
                    }
                    System.out.println();
                }
            }
        System.out.println("Total size: " + sum);
    }
}
