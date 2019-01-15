package Chapter18.Task27;

import java.io.Serializable;

public class A implements Serializable {
    private int i;
    A(int i) { this.i = i; }
    public String toString() { return "A:" + i; }
}
