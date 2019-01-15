package Chapter12.Task25;

public class B extends A {

    void globalMethod () throws MyExseption_level2 {
        System.out.println(" in    class A () ");
        throw new MyExseption_level2();

    }
}
