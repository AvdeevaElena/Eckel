package Chapter11.Task9;

import java.util.ArrayList;
import java.util.List;

/* Exercise 3: Modify innerclasses/Sequence.java so that you can add any number of elements to it.*/

public class Sequence {
    private List<Object> items;

    private Sequence(int size) {
        items = new ArrayList<>(size);
    }

    public static void main(String[] args) {

        Sequence seq = new Sequence(10);
    }
}
