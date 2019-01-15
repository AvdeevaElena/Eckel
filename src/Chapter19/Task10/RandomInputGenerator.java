package Chapter19.Task10;

import Chapter16.Task12.Generator;

public class RandomInputGenerator implements Generator<Input> {
    @Override
    public Input next() {
        return Input.randomSelection();
    }
}
