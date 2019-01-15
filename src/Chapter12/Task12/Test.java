package Chapter12.Task12;

import Chapter10.Task20.Selector;
import Chapter10.Task20.Sequence;

//Implement reverseSelector( ) in Sequence.java.
public class Test {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 100; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
    }
}
