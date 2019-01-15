package Chapter18.Task23;

/*Exercise 23
// Create and test a utility to print the contents of a CharBuffer
// up to the point where the characters are no longer printable.*/
import java.nio.*;
public class CharBufferPrinter {
    public static boolean isPrintable(char c) {

        return (((c >= '!') && (c <= '~')) ? true : false);
    }
    public static void printCharBuffer(CharBuffer cb) {
        cb.clear();
        while(cb.hasRemaining()) {
            char c = cb.get();
            if(isPrintable(c)) System.out.print(c);
        }
    }
    public static void main(String[] args) throws Exception {
        char[] ca = {'w','x','y','z'};
        CharBuffer cb = CharBuffer.wrap(ca);
        System.out.println("CharBuffer by wrapping char[]: ");
        printCharBuffer(cb);

        CharBuffer cb2 = CharBuffer.allocate(6);
        char[] ca2 = {'s','t','u','v','w'};
        cb2.put(ca2);
        System.out.println("CharBuffer by allocation: ");
        printCharBuffer(cb2);


        char[] ca3 = {(char)0x01, (char)0x07, (char)0x7F,'b','y','e'};
        CharBuffer cb3 = CharBuffer.wrap(ca3);
        System.out.println("CharBuffer including some unprintables: ");
        printCharBuffer(cb3);
    }
}
