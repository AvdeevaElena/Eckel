package Chapter14.Task22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class DynamicProxyHandler implements InvocationHandler {
        private Object proxied;
	public DynamicProxyHandler(Object proxied) {
            this.proxied = proxied;
        }
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long timeIn = new Date().getTime();
            System.out.println("**** proxy: " + proxy.getClass() +
                    ", method: " + method + ", args: " + args +
                    ", invoked at " + timeIn + " on " + (new Date()));
            if(args != null)
                for(Object arg : args)
                    System.out.println("  " + args);
            long timeOut = new Date().getTime();
            System.out.println("Method call-return time: " + (timeOut - timeIn) + " msecs");
            return method.invoke(proxied, args);
        }
    }

