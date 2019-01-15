package Chapter14.Task21;

/*Exercise 21
// Modify SimpleProxyDemo.java so that it measures method-call times.
import static net.mindview.util.Print.*;
import java.util.*;*/

public class SimpleProxyDemo {

    public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
}
        public static void main(String[] args) {
            consumer(new RealObject());
            consumer(new SimpleProxy(new RealObject()));
            consumer(new SimpleProxy(new RealObject()));
            consumer(new SimpleProxy(new RealObject()));
        }
}
