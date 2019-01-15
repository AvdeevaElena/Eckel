package Chapter7.Task15.Test9;

/*Exercise 15: (2) Create a class inside a package. Your class should contain a protected method.
 Outside of the package, try to call the protected method and explain
the results. Now inherit from your class and call the protected method from inside a method of your derived class.*/

public class TestPr2 extends TestProtected{

    void test () {
        TestProtected testProtected = new TestProtected();
        testProtected.protPrint();
    }
}
