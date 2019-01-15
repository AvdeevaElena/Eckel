package Chapter19.Task2;


/*Exercise 2
// Instead of implementing an interface, make next() a static
// method. What are the benefits and drawbacks of this approach?*/

public class EnumImplementation {


    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i++) {
            System.out.print(cc.next());
            System.out.print((i < 9) ? ", " : "");
        }
    }


}
