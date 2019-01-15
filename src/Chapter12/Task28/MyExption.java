package Chapter12.Task28;

public class MyExption extends RuntimeException {

   String strValue;
    public MyExption(String strValue) {
        this.strValue = strValue;
    }

    public void printExpt() {
        System.out.println(strValue);
    }
}
