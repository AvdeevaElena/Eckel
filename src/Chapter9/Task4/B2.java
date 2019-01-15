package Chapter9.Task4;

public  class B2 extends A2 {

    int value = 2;

    void  print2() {
        System.out.println("print B" +value );
    };

    static void refToA(A2 a) {
      //  B b = (B) a;
        a.print2();
    }

    public static void main(String[] args) {

        B2 b2 = new B2();
        refToA(b2);
    }

}
