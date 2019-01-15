package Chapter12.Task22;

public class FailingConstructor {

    String str;
    Integer [] arr = new Integer[3];

    FailingConstructor(String str) throws Exception{
        this.str = str;
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
    }

    public static void main(String[] args) {
       try {
           FailingConstructor fc = new FailingConstructor("SomeThing");
       }
       catch( Exception e) {};
   }
}
