package Chapter10.Task8;

public class Outer {

    class Inner {
        private int value = 100;
        private int method() {return value;};
    }

    Inner inner = new Inner();
    //inner.value;
    public static void main(String[] args) {

    }
}
