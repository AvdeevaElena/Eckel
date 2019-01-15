package Chapter18.Task20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
    public static byte[] read(File file) throws IOException {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            return bytes;
        }
    }

    public static byte[] read(String filename) throws IOException {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            return bytes;
        }
    }
}
