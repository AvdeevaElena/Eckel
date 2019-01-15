package Chapter10.Task10;

/*Exercise 13: (1) Repeat Exercise 9 using an anonymous inner class.*/

public class Animal {

    Flayable canFly (){

        return new Flayable() {
            public void canFly() {
                System.out.println("I can Fly");
            };
        };
    }

    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.canFly().canFly();
    }

}
