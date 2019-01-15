package Chapter12.Task12;

public class SequenceSelector implements Selector {
    private Object[] items;
    private int i = items.length - 1;
    public boolean end() { return i == -1; }
    public Object current() { return items[i]; }
    public void next() { if (!end()) i--; }
}
