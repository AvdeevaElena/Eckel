package Chapter12.Task11;

public class MyExption2 extends Exception {

    String strValue;
    public MyExption2(String strValue) {
        this.strValue = strValue;
    }

    public void printExpt() {
        System.out.println(strValue);
    }
}
