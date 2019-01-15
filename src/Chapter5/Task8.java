package Chapter5;

/*Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: the first time
 without using this, and the second time using this—just to see it working; you should not use this form in practice.*/
public class Task8 {



    void method1 () {

        System.out.println("method1");
    }

    void method2 () {

        method1();
        System.out.println("method2");
    }

     Task8 method3 () {


        System.out.println("method3");
        return this;


    }

}
