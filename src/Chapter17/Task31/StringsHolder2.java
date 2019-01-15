package Chapter17.Task31;

public class StringsHolder2 {
    private int size = 1000;
    private int index = 0;
    private String[] sArray = new String[size];
    // Can add only Strings:
    public void add(String s) {
        if(index < size) sArray[index++] = s;
    }
    // get() returns only Strings:
    public String get(int i) {
        if(-1 < i && i < size) return sArray[i];
        else throw new ArrayIndexOutOfBoundsException(i);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sArray.length; i++) sb.append((sArray[i] + " "));
        return sb.toString();
    }
}
