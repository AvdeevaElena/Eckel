package Chapter12.Task4;

public class MyExption extends Exception{

   String strValue;
    public MyExption(String strValue) {
        this.strValue = strValue;
    }

    public void printExpt() {
        System.out.println(strValue);
    }
}
