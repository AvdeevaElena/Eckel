package Chapter12.Task12;


//Exercise 12:
// Modify innerclasses/Sequence.java so that it throws an appropriate exception if you try to put in too
 //       * many elements.
public class Sequence {

    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }

    public void add(Object x) throws ArrayIndexOutOfBoundsException {
       if (next >= items.length) {
           throw new ArrayIndexOutOfBoundsException();}

        if(next < items.length) {
            items[next++] = x;
        }
}
    private class SequenceSelector implements Selector {

        private int i = items.length - 1;
        public boolean end() { return i == -1; }
        public Object current() { return items[i]; }
        public void next() { if (!end()) i--; }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}
