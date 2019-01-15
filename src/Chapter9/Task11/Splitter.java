package Chapter9.Task11;
import java.util.*;


public class Splitter extends StringProcessor {

    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));

    }
}
