package Chapter17.Task32;

public class IntegerHolder2 {
    private final int SIZE = 1000;
    private int index = 0;
    private int[] iArray = new int[SIZE];
    public int size() { return SIZE; }
    // Can add only ints:
    public void add(int x) {
        if(index < SIZE) iArray[index++] = x;
    }
    // get() returns only ints:
    public int get(int i) {
        if(-1 < i && i < SIZE) return iArray[i];
        else throw new ArrayIndexOutOfBoundsException(i);
    }
    public void incrementAll() {
        for(int i = 0; i < SIZE; i++) iArray[i]++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < iArray.length; i++) sb.append((iArray[i] + " "));
        return sb.toString();
    }
}
