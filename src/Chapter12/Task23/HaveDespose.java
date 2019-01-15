package Chapter12.Task23;

public class HaveDespose {
    private boolean haveDisposed;

    static  int count = 0;

    HaveDespose() {
        count++;
    }
    void despose(){
        haveDisposed = true;
    };
}
