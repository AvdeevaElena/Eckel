package Chapter8.Task10;

/*Exercise 10: (3) Create a base class with two methods. In the first method, call the second method.
 Inherit a class and override the second method. Create an object of the derived class, upcast it to the base type,
  and call the first method. Explain what happens.*/
public class B extends A {

    void method2() {
        System.out.println(" method_2b class B");
    };

    public static void main(String[] args) {

        B b = new B();
        A.change(b);

    }

}
