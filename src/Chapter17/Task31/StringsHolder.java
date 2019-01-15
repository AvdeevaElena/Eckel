package Chapter17.Task31;

public class StringsHolder {
    private int size = 0;
    private String[] sArray = new String[size];



    public void add(String s) {
        size += 1;
        String[] temp = new String[size];
        for(int i = 0; i < sArray.length; i++) {
            temp[i] = sArray[i];
            temp[size - 1] = s;
            sArray = temp;
        }
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
