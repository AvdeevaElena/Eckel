package Chapter17.Task32;

public class IntegerHolder {
    private int size = 0;
    private int[] sArray = new int[size];


    public int size() { return size; }
    public void add(int aInt) {
        size += 1;
        int[] temp = new int[size];
        for(int i = 0; i < sArray.length; i++) {
            temp[i] = sArray[i];
            temp[size - 1] = aInt;
            sArray = temp;
        }
    }
    // get() returns only Strings:
    public int get(int i) {
        if(-1 < i && i < size) return sArray[i];
        else throw new ArrayIndexOutOfBoundsException(i);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sArray.length; i++) sb.append((sArray[i] + " "));
        return sb.toString();
    }

    public void incrementAll() {
        for(int i = 0; i < size; i++) sArray[i]++;
    }
}
