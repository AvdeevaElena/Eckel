package Chapter7.Task24;

public class MyClass extends Beetle {

    private int l = printInit("MyClass.l initialized");
    public MyClass() {
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {

        System.out.println("MyClass constructor");
        MyClass b = new MyClass();
    }

}
