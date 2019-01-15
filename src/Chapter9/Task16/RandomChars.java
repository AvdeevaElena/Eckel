package Chapter9.Task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;


/*Exercise 16: (3) Create a class that produces a sequence of chars. Adapt this class so that it can be
 an input to a ScannerTest object.*/

public class RandomChars implements Readable{

    private int count;
    private static Random random = new Random();

    RandomChars (int count) {
        this.count = count;
    }
    public int next() { return random.nextInt(21) + 20; }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) return -1;
        for(int i = 0; i < count; i++) {
            cb.append((char)this.next() + " ");
        }
        cb.append(" ");
        return count;
    }
}
