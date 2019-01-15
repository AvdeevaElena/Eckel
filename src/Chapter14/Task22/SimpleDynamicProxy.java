package Chapter14.Task22;

import Chapter14.Task21.Interface;
import Chapter14.Task21.RealObject;

import java.lang.reflect.Proxy;

/*Exercise 22, page 598
// Modify SimpleDynamicProxy.java so that it measures method-call times.*/

public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
