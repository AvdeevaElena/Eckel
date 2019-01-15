package Chapter10.Task20;

public class Sequence {

    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
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
