package Chapter18.Task6;

import Chapter18.Task5.ProcessFiles;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/* Exercise 6
/* Use ProcessFiles to find all the Java source-source code files in
* a particular directory subtree that have been modified after a */
public class DataFileSeach {
    public static void main(final String[] args) {
        if(args.length != 2) {
            return;
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("11/28/2018");
        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                Date modDate = new Date(file.lastModified());
                try {
                    if(modDate.after(sdf.parse(args[1])))
                        System.out.println(file);
                } catch(ParseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }, "java").start(args);
    }
}
