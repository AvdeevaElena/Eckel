package Chapter14.Task19;

import java.lang.reflect.InvocationTargetException;


/*Exercise 19, page 593
// In ToyTest.java, use reflection to create a Toy object using
// the non-default constructor.*/

public class ToyTest {
    public static void main(String[] args) {  // get appropriate constructor and create new instance:
		try {
        Toy.class.getDeclaredConstructor(int.class).newInstance(1);
        // catch four exceptions:
    } catch(NoSuchMethodException e) {
            System.out.println("No such method: " + e);
    } catch(InstantiationException e) {
            System.out.println("Unable make Toy: " + e);
    } catch(IllegalAccessException e) {
            System.out.println("Unable access: " + e);
    } catch(InvocationTargetException e) {
            System.out.println("Target invocation problem: " + e);
    }
}
}
