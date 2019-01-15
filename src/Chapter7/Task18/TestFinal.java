package Chapter7.Task18;

public class TestFinal {

    final int a =10;
    static final int b =110;

    public static void main(String[] args) {

        TestFinal tf = new TestFinal();
        System.out.println(tf.a);
        System.out.println(TestFinal.b);
    }
}
