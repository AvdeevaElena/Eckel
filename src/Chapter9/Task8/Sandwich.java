package Chapter9.Task8;

/*Exercise 8: (2) In polymorphism.Sandwich.java, create an interface called FastFoo d (with appropriate methods)
and change Sandwic h so that it also implements FastFood.*/

public class Sandwich extends PortableLunch implements FastFood {

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()"); }


    public void makeCheeseBurger() {

        System.out.println("CheeseBurger " + b +" " +c + " "+ b);
    };
    public void makeGamburer() {

        System.out.println("Gamburer " + b +" " +c +" "+p+" " +l+" "+ b);
    };




    public static void main(String[] args) {

        new Sandwich();

        FastFood fastFood = new Sandwich();
        fastFood.makeCheeseBurger();
        fastFood.makeGamburer();

    }


}
