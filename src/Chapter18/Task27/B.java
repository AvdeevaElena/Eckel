package Chapter18.Task27;
import java.io.Serializable;


public class B implements Serializable {
    private char c;
    private A a;

    B(char c, A a) {
        this.c = c;
        this.a = a;
    }

    public String toString() {
        return "B:" + c + " " + a;
    }
}
