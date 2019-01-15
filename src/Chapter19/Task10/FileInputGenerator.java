package Chapter19.Task10;

import Chapter11.Task26.TextFile;
import Chapter16.Task12.Generator;

import java.io.IOException;
import java.util.Iterator;

public class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;

    /*package*/ FileInputGenerator(String fileName) {
        try {
            input = new TextFile(fileName, ";").iterator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Input next() {
        if (!input.hasNext()) {
            return null;
        }
        return Enum.valueOf(Input.class, input.next().trim());
    }

}