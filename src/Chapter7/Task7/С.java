package Chapter7.Task7;

public class С extends A {

    B b;

     С(){
         super(1);
         System.out.println("Const C");

     }


    public static void main(String[] args) {

        С c = new С();
        System.out.println(c);
        System.out.println(c.b);

    }
}
