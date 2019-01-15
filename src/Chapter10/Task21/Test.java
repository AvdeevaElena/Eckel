package Chapter10.Task21;
/*/* Exercise 23: Create an interface U with three methods. Create a class A with a method that produces a reference to a U by
 * building an anonymous inner class. Create a second class B that contains an array of U. B should have one method that accepts
 * and stores a reference to a U in the array, a second method that sets a reference in the array (specified by the method argument)
 * to null, and a third method that moves through the array and calls the methods in U. In main( ), create a group of A objects
 * and a single B. Fill the B with U references produced by the A objects. Use the B to call back into all the A objects. Remove some of the U references from the B.
 */
public class Test {
    public static void main(String[] args) {
        A [] aArr = new A[7];
        for(int i = 0; i<aArr.length; i++){
            aArr[i] = new A();
        }
        B b = new B();
        for (int i = 0; i<aArr.length; i++){
            b.setRefU(aArr[i].getU(), i);
        }
      b.running();
      b.deleteRefU(2);

    }
}
