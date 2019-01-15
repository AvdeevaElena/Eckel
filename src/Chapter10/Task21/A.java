package Chapter10.Task21;

public class A {
    U getU () {
        return new U(){
          public   void method1() { System.out.println("method1()"); };
          public  void method3() {System.out.println("method2()"); };
          public  void method2() { System.out.println("method3()"); };
        };
    }
}
