package Chapter14.Task23;

import Chapter14.Task21.Interface;
import Chapter14.Task21.RealObject;

import java.lang.reflect.Proxy;

/*, Exercise 23, page 598
// Inside invoke() in SimpleDynamicProxy.java, try to print the proxy argument and explain*/

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
