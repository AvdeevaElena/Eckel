package Chapter10.Task11;

/*Exercise 13: (1) Repeat Exercise 9 using an anonymous inner class.*/

public class Animal {

    int value = 100;
    void voice() {
        System.out.println("R-r=r=r=r!!!");
    }
    public Flayable fly() {
        return new Flayable() {
            @Override
            public void canFly() {
                value = 200;
                voice();
                System.out.println("I can fly " +value +" mills");
            }

        };
    }
    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.fly().canFly();

    }

}
