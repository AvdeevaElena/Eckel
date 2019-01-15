package Chapter14.Task25;

import java.lang.reflect.Method;


/*  Exercise 25, page 613
/* Create a class containing private, protected and package-access methods.
* Write code to access these methods from outside of the class's package.*/

public class Test {
    public static void main(String[] args) throws Exception {
        MainInterface a = returnObjClass.makeClass();
        System.out.println("a is of class type: " + a.getClass().getName());
        for(Method m : a.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(a);
        }
    }
}
