package Chapter17.Task4;

/* Exercise 4, page 809
/* Create a Collection initializer that opens a file and breaks
* it into words using TextFile, and then uses the words as the
* source of data for the resulting Collection. Demonstrate that
* it works.*/




import java.io.IOException;
import java.util.Collection;
import java.util.*;

public class TestFile {
    static Collection<String> CollectFromText(String fileName) throws IOException {
        String[] list = TextFile.read(fileName).split(" ");
        return Arrays.asList(list);
    }
    static Collection<String> CollectFromText2(String fileName) throws IOException {
        String[] set = TextFile.read(fileName).split(" ");
        return new TreeSet<String>(new TextFile(fileName, "\\W+"));
    }

    public static void main(String[] args) throws IOException {
       // C:\Users\User\IdeaProjects\Eckel
        System.out.println(CollectFromText("SomeText.java"));
        System.out.println(CollectFromText("SomeText.java"));
    }
}
