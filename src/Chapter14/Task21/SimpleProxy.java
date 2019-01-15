package Chapter14.Task21;

import java.util.Date;

public class SimpleProxy implements Interface {
    private Interface proxied;
    private static int doCount = 0;
    private static int sECount = 0;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        long timeIn = new Date().getTime();
        System.out.println("Time called doSomething() " + doCount + ": " + timeIn + " msecs");
        System.out.println("on " + new Date());
        doCount++;
        proxied.doSomething();
        System.out.println("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
    }
    public void somethingElse(String arg) {
        long timeIn = new Date().getTime();
        System.out.println("Time called somethingElse() " + sECount + ": " + timeIn + " msecs");
        System.out.println("on " + new Date());
        sECount++;
        proxied.somethingElse(arg);
        System.out.println("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
    }
}

